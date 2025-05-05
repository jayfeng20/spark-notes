#core-concept #data-source
[Parquet](https://oreil.ly/-wptz)
- Parquet is an open source columnar file format that offers many I/O optimizations (such as compression, which saves storage space and allows for quick access to data columns).
- Parquet files are stored in a directory structure that contains the data files, metadata, a number of compressed files, and some status files. Metadata in the footer contains the version of the file format, the schema, and column data such as the path, etc.

## what does parquet look like
![[Screenshot 2025-05-05 at 1.38.27 PM.png]]
#pitfalls 
we recommend that after you have transformed and cleansed your data, <mark style="background: #FFB8EBA6;">you save your DataFrames in the Parquet format for downstream consumption.</mark> (Parquet is also the default table open format for Delta Lake and Iceberg)

## read parquet into a DataFrame

![[Screenshot 2025-05-05 at 1.37.25 PM.png]]
#pitfalls 
no need to specify schema unless reading from a stream because Parquet saves it as part of the metadata

[[Reading Parquet into a Spark SQL Table]]
[[Writing DataFrames to Parquet]]