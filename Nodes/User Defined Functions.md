#core-concept #spark-sql 

The benefit of creating your own PySpark or Scala UDFs is that you (and others) will be able to make use of them within Spark SQL itself. For example, a data scientist can wrap an ML model within a UDF so that a data analyst can query its predictions in Spark SQL without necessarily understanding the internals of the model.

#pitfalls 
UDFs operate per session and they will not be persisted in the underlying metastore

![[Screenshot 2025-05-05 at 4.47.13 PM.png]]![[Screenshot 2025-05-05 at 4.47.52 PM.png]]


[[Evaluation Order and Null Checking in Spark SQL]]
[[Speeding Up and Distributing PySpark UDFs with Pandas UDFs]]