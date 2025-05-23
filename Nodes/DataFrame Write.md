#api  #api-functions 

To write the DataFrame into an external data source in your format of choice, you can use the DataFrameWriter interface. Like DataFrameReader, it supports [multiple data sources](https://oreil.ly/4rYNZ). Parquet, a popular columnar format, is the default format; it uses snappy compression to compress the data. If the DataFrame is written as Parquet, the schema is preserved as part of the Parquet metadata. In this case, subsequent reads back into a DataFrame do not require you to manually supply a schema.


#pitfalls 
`DataFrameWriter` recommended usage pattern:
```
DataFrameWriter.format(args)
 .option(args)
 .bucketBy(args)
 .partitionBy(args)
 .save(path)

DataFrameWriter.format(args).option(args).sortBy(args).saveAsTable(table)
```

To get instance handle, do:
```
DataFrame.write
// or
DataFrame.writeStream
```

[[DataFrame Write Spark 3]]

## Methods

![[Screenshot 2025-05-05 at 1.30.57 PM.png]]
![[Screenshot 2025-05-05 at 1.31.20 PM.png]]
## Saving a DF as a Parquet File or SQL table
A common data operation is to explore and transform your data, and then persist the DataFrame in Parquet format or save it as a SQL table. Writes data to a **path** (like a file system directory in S3, HDFS, or local disk)
![[Screenshot 2025-05-04 at 7.09.46 PM.png]]

Alternatively, you can save it as a table, which registers metadata with the Hive metastore:
![[Screenshot 2025-05-04 at 7.10.03 PM.png]]