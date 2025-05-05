#api #example #api-functions 

Spark provides an interface, `DataFrameReader`, that enables you to read data into a DataFrame from myriad data sources in formats such as JSON, CSV, Parquet, Text, Avro, ORC, etc. 

Likewise, to write a DataFrame back to a data source in a particular format, Spark uses `DataFrameWriter`.

#pitfalls 
When the data source is large, <mark style="background: #FFB8EBA6;">define a schema</mark> for `DataFrameReader` instead of letting Spark infer it.

![[Screenshot 2025-05-04 at 7.02.21 PM.png]]

## Example in PySpark

![[Screenshot 2025-05-04 at 7.03.40 PM.png]]
## Example in Scala Spark
![[Screenshot 2025-05-04 at 7.04.35 PM.png]]