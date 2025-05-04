This module works well with structured data. You can read data stored in an RDBMS table or from file formats with structured data (CSV, text, JSON, Avro, ORC, Parquet, etc.) and then construct permanent or temporary tables in Spark. Also, when using Spark’s Structured APIs in Java, Python, Scala, or R, you can combine SQL-like quer‐ ies to query the data just read into a Spark DataFrame. To date, Spark SQL is ANSI SQL:2003-compliant and it also functions as a pure SQL engine.

```
// In Scala 
// Read data off Amazon S3 bucket into a Spark DataFrame 

spark.read.json("s3://apache_spark/data/committers.json") .createOrReplaceTempView("committers") 

// Issue a SQL query and return the result as a Spark DataFrame 

val results = spark.sql("""SELECT name, org, module, release, num_commits FROM committers WHERE module = 'mllib' AND num_commits > 10 ORDER BY num_commits DESC""")
```

