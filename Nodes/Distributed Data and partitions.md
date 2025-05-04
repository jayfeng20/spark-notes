While the data is distributed as partitions across the physical cluster, Spark treats each partition as a high-level logical data abstraction—as a DataFrame in memory. Though this is not always possible, each Spark executor is preferably allocated a task that requires it to read the partition closest to it in the net‐ work, observing data locality.![[Screenshot 2025-05-04 at 11.05.10 AM.png]]


Partitioning allows for efficient parallelism. A distributed scheme of breaking up data into chunks or partitions allows Spark executors to process only data that is close to them, minimizing network bandwidth. That is, each executor’s core is assigned its own data partition to work on
![[Screenshot 2025-05-04 at 11.05.52 AM.png]]
For example, this code snippet will break up the physical data stored across clusters into eight partitions, and each executor will get one or more partitions to read into its memory
![[Screenshot 2025-05-04 at 11.06.06 AM.png]]