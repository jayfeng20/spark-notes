#spark-sql #spark-setup #configuration 


Tables hold data. Associated with each table in Spark is its relevant metadata, which is information about the table and its data: the schema, description, table name, data‐ base name, column names, partitions, physical location where the actual data resides, etc. All of this is stored in a central metastore.

Instead of having a separate metastore for Spark tables, Spark by default uses the <mark style="background: #FFB8EBA6;">Apache Hive metastore</mark>, located at `/user/hive/warehouse`, to persist all the metadata about your tables. However, you may <mark style="background: #FFB8EBA6;">change the default location</mark> by setting the Spark config variable `spark.sql.warehouse.dir` to another location, which can be set to a local or external distributed storage.

[[Managed Versus Unmanaged Tables]]
[[Create SQL Databases and Tables]]
[[Create SQL Views]]
[[Spark SQL Catalog]]
[[Caching SQL Tables]]
[[Reading Table into DataFrames]]
[[Data Sources for DataFrames and SQL Tables]]