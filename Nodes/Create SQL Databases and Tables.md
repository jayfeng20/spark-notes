#spark-sql  

By default, Spark creates tables under the `default` database

# Create non-default database
```
// In Scala/Python 

spark.sql("CREATE DATABASE learn_spark_db") 
spark.sql("USE learn_spark_db")
```

[[Managed Table]]
# Create Managed Table

Use `spark.sql`
```
// In Scala/Python 

spark.sql("CREATE TABLE managed_us_delay_flights_tbl (date STRING, delay INT, distance INT, origin STRING, destination STRING)")
```

Use DataFrame API
```
# In Python
# Path to our US flight delays CSV file

csv_file = "/databricks-datasets/learning-spark-v2/flights/departuredelays.csv"

# Schema as defined in the preceding example

schema="date STRING, delay INT, distance INT, origin STRING, destination STRING"
flights_df = spark.read.csv(csv_file, schema=schema)
flights_df.write.saveAsTable("managed_us_delay_flights_tbl")
```

[[Unmanaged Table]]
# Create Unmanaged Table

It basically tells Spark "here's the path where the data actually lives" so Spark will only take care of the metadata
![[Screenshot 2025-05-04 at 11.03.34 PM.png]]