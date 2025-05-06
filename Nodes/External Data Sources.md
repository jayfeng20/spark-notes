#core-concept #spark-sql 
Spark SQL includes a data source API that can read data from other databases using JDBC. It simplifies querying these data sources as it returns the results as a [[DataFrame]].

To get started, you will need to specify the JDBC driver for your JDBC data source and it will need to be on the Spark classpath. From the $SPARK_HOME folder, you’ll issue a command like the following:
```
./bin/spark-shell --driver-class-path $database.jar --jars $database.jar
```
![[Screenshot 2025-05-05 at 5.43.54 PM.png]]
#reference 
See [Full Documentations](https://oreil.ly/OUG9A)

#pitfalls #performance 
[[Partitioning]]