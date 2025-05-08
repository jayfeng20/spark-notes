# DataFrame.cache()

`cache()` will store as many of the partitions read in memory across Spark executors as memory allows (see Figure 7-2). While a DataFrame may be fractionally cached, partitions cannot be fractionally cached (e.g., if you have 8 partitions but only 4.5 partitions can fit in memory, only 4 will be cached). However, if not all your partitions are cached, when you want to access the data again, the partitions that are not cached will have to be recomputed, slowing down your Spark job.


# How cache can improve performance

![[Screenshot 2025-05-07 at 8.11.05 PM.png]]

The first `count()` materializes the cache, whereas the second one accesses the cache, resulting in a close to 12 times faster access time for this data set.


#spark-ui 
See how they fit into memory through Spark UI
![[Screenshot 2025-05-07 at 8.12.22 PM.png]]


