#api
#core-concept 
![[Screenshot 2025-05-04 at 11.23.44 AM.png]]

Spark operations on distributed data can be classified into two types: 
- [[Transformations]]
- [[Actions]]

All transformations are evaluated lazily [[Lazy Evaluation]]. That is, their results are not computed immediately, but they are recorded or remembered as a lineage. A recorded lineage allows
Spark, at a later time in its execution plan, to rearrange certain transformations, coalesce them, or optimize transformations into stages for more efficient execution. 
Lazy
evaluation is Spark’s strategy for delaying execution until an action is invoked or data
is “touched” (read from or written to disk). Part of [[Parallelism Optimization]]

**Just remember, transformation operations are only evaluated when encountering an action operation**

