#performance #core-concept #spark-sql 

## Spark Encoders are better than Java native encoders

JVM native serializer and deserializer:
![[Screenshot 2025-05-06 at 5.03.40 PM.png]]


[[Serialization and Deserialization]]

• Spark’s internal Tungsten binary format (see Figures 6-1 and 6-2) stores objects off the Java heap memory, and it’s compact so those objects occupy less space.
• Encoders can quickly serialize by traversing across the memory using simple pointer arithmetic with memory addresses and offsets (Figure 6-2).
• On the receiving end, encoders can quickly deserialize the binary representation into Spark’s internal representation. Encoders are not hindered by the JVM’s garbage collection pauses.

![[Screenshot 2025-05-06 at 5.19.22 PM.png]]

#performance #pitfalls 
[[DataFrame vs Dataset]]
Dataset uses JVM objects which has excess serialization and deserialization which may affect performance when data is large

#pitfalls #performance 
[[Mitigate SerDeserialization Cost When Using Datasets]]