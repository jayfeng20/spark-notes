#configuration #performance #reference 
![[Screenshot 2025-05-07 at 8.00.29 PM.png]]
#pitfalls 
Shuffle partitions are created during the shuffle stage. By default, the number of shuffle partitions is set to 200 in `spark.sql.shuffle.partitions`. You can adjust this number depending on the size of the data set you have, to reduce the amount of small partitions being sent across the network to executors’ tasks.

**The default value for spark.sql.shuffle.partitions is too high for smaller or streaming workloads; you may want to reduce it to a lower value such as the number of cores on the executors or less.**

[More tips](https://oreil.ly/QpVyf)