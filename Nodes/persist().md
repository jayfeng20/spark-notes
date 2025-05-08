#performance 
# persist()

- Persist gives you control over how data is persisted (on memory? on disk? serialized or not?)
- Data on disk is always serialized using either [Java or Kryo serialization](https://oreil.ly/NIL6a).

[[cache()]] is just `persist()` with `persist(StorageLevel.LEVEL)` with `LEVEL = MEMORY_AND_DISK`


![[Screenshot 2025-05-07 at 8.13.34 PM.png]]

#pitfalls 
Each `StorageLevel` (except `OFF_HEAP`) has an equivalent` LEVEL_NAME_2`, which means replicate twice on two different Spark executors: `MEMORY_ONLY_2`, `MEMORY_AND_DISK_SER_2`, etc. While this option is expensive, it allows data locality in two places, providing fault tolerance and giving Spark the option to schedule a task local to a copy of the data.

# Example

![[Screenshot 2025-05-07 at 8.15.33 PM.png]]