#core-concept 

`Map`: Transforms each input element into a new output element. Think of it as 
per-record processing.

`Reduce`: Aggregates data by key (or group), often involving shuffling data to bring related values together.

# During shuffling operations -> `joins(), groupBy(), orderBy()` for example
[[Wide Transformations]]

## Let's say
You’re doing a **join on column `id`**:  `df1.join(df2, "id")`:
- Row A: `{"id": 123, "val": "X"}` lives in `df1`, on **Partition 1**, on **Executor 1**
- Row B: `{"id": 123, "val": "Y"}` lives in `df2`, on **Partition 2**, on **Executor 2**

What will happen
- Spark must **bring Row A and Row B together** to perform the join
- Since they are on different executors, it can’t do this directly — **it must shuffle**.

**What exactly happens**:
1. Map
	1. Each row will be mapped (written) to a "bucket" (lives in local shuffle file) based on **Hashed Join Key** (in this case `id`)
	2. Each bucket will have an assigned `reducer`
	3. So: Two local shuffle files on two different machines — both containing rows for key `someId`, in the section marked for **Reducer X**.
2. Reduce
	1. 🔻 Reducer 7 is just a task (not a machine!) that will:
		1. **Pull** data for bucket 7 (aka key = 123):
			1. From Executor 1’s shuffle file → gets Row A
			2. From Executor 2’s shuffle file → gets Row B
		2. Now has **both rows in memory**
		3. **Performs the join logic** → produces a joined row:  
    `{"id": 123, "val1": "X", "val2": "Y"}`
📍Note: Reducer 7 could run on **any executor**, Spark decides based on resource availability.
3. Afterwards
	1. Each **reduce task** (Reducer 7, Reducer 8, etc.) writes its joined rows to **in-memory** storage (if memory is sufficient). These are now considered the **output partitions** of the join.
	2. Each reducer's output becomes **a partition** of the resulting DataFrame.
	3. The number of partitions of the join result is equal to the **number of reducers**, which by default is set by:
	    `spark.sql.shuffle.partitions // default is 200`
- So unless you say something like `repartition(100)` or `coalesce(10)`, the post-join data **stays as is**.

