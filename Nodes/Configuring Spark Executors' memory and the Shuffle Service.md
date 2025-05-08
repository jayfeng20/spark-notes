#performance #configuration #deployment #reference 
[[Spark executors]]

[Documentations on Memory Management](https://spark.apache.org/docs/latest/tuning.html#memory-management-overview)

The amount of memory available to each executor is controlled by `spark.executor.memory`. 
This is divided into three sections
- execution memory
- storage memory
- reserved memory.

In Spark, execution and storage share a unified region (M). When no execution memory is used, storage can acquire all the available memory and vice versa. Execution may evict storage if necessary, but only until total storage memory usage falls under a certain threshold (R). In other words, `R` describes a subregion within `M` where cached blocks are never evicted. Storage may not evict execution due to complexities in implementation.

- `spark.memory.fraction` expresses the size of `M` as a fraction of the (JVM heap space - 300MiB) (default 0.6). The rest of the space (40%) is reserved for user data structures, internal metadata in Spark, and safeguarding against OOM errors in the case of sparse and unusually large records.
- `spark.memory.storageFraction` expresses the size of `R` as a fraction of `M` (default 0.5). `R` is the storage space within `M` where cached blocks immune to being evicted by execution.
`this will work for most cases`
- ![[Screenshot 2025-05-07 at 7.05.28 PM.png]]

# Why is this important to performance?
Execution memory is used for Spark shuffles, joins, sorts, and aggregations.
[[Map Reduce]]


[[Map and Shuffle Operations Configurations]]
[[Distributed Data and partitions]]
