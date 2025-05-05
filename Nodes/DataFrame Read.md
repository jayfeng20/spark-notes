#api  #api-functions 

Spark provides an interface, `DataFrameReader`, that enables you to read data into a DataFrame from myriad data sources in formats such as JSON, CSV, Parquet, Text, Avro, ORC, etc.  You can **only** access a DataFrameReader through a SparkSession instance.



#pitfalls 
The recommended pattern of <mark style="background: #FFB8EBA6;">reading data from a data source into a DataFrame</mark>:
```
DataFrameReader.format(args).option("key","value").schema(args).load()
```

#pitfalls 
When the data source is large, <mark style="background: #FFB8EBA6;">define a schema</mark> for `DataFrameReader` instead of letting Spark infer it.

#pitfalls 
In general, no schema is needed when reading from a static Parquet data source—the Parquet metadata usually contains the schema, so it’s inferred. However, for streaming data sources you will <mark style="background: #FFB8EBA6;">have to provide a schema.</mark>

## How to use 

- You cannot create an instance of `DataFrameReader` but you can access an instance handle:
```
SparkSession.read 
// or 
SparkSession.readStream
```


## Methods
#pitfalls 
no need to specify the path to data source in both `option()` and `load()`, just pick one

![[Screenshot 2025-05-05 at 1.18.28 PM.png]]
[Spark Documentation](https://oreil.ly/XujEK)

![[Screenshot 2025-05-04 at 7.02.21 PM.png]]

## Example in PySpark

![[Screenshot 2025-05-04 at 7.03.40 PM.png]]
## Example in Scala Spark
![[Screenshot 2025-05-04 at 7.04.35 PM.png]]


## Another example in Scala
![[Screenshot 2025-05-05 at 1.21.33 PM.png]]