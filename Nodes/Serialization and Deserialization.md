#core-concept #spark-sql 

A concept not new in distributed computing, where data frequently travels over the network among computer nodes in a cluster, serialization and deserialization is the process by which a typed object is encoded (serialized) into a binary presentation or format by the sender and decoded (deserialized) from binary format into its respective data-typed object by the receiver.

A JVM object has to be shared **among nodes in a Spark cluster**, the sender would **serialize (encode)** it into an array of bytes, and the receiver would **deserialize it** back into a JVM object of the same type