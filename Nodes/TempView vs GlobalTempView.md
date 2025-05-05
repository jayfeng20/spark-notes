#spark-sql #api 

A temporary view is tied to a single SparkSession within a Spark application. In contrast, a global temporary view is visible across multiple SparkSessions within a Spark application.

#pitfalls 
Use `GlobalTempView` when data needs to be shared across different `SparkSessions` that do not share the same Hive metastore configurations