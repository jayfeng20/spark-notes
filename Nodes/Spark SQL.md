#core-concept  #api-functions #api 

You can read data stored in an RDBMS table or from file formats with structured data (CSV, text, JSON, Avro, ORC, Parquet, etc.) and then construct permanent or temporary tables in Spark. Also, when using Spark’s Structured APIs in Java, Python, Scala, or R, you can combine SQL-like quer‐ ies to query the data just read into a Spark DataFrame. To date, Spark SQL is ANSI SQL:2003-compliant and it also functions as a pure SQL engine.

```
// In Scala 
// Read data off Amazon S3 bucket into a Spark DataFrame 

spark.read.json("s3://apache_spark/data/committers.json") .createOrReplaceTempView("committers") 

// Issue a SQL query and return the result as a Spark DataFrame 

val results = spark.sql("""SELECT name, org, module, release, num_commits FROM committers WHERE module = 'mllib' AND num_commits > 10 ORDER BY num_commits DESC""")
```

## All `spark.sql` queries executed in this manner return a DataFrame

#performance 
Using `Spark SQL` vs using `spark.sql.functions._`, there is minimal performance difference

## loading csv data
![[Screenshot 2025-05-04 at 10.45.58 PM.png]]

## then you can just write SQL-like code to query data
![[Screenshot 2025-05-04 at 10.47.53 PM.png]]![[Screenshot 2025-05-04 at 10.48.56 PM.png]]