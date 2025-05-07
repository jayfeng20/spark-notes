#chapters #core-concept #api 
[[Dataset]]

## Single API for Java and Scala
Thanks to this singular API, Java developers no longer risk lagging behind.

Scala `case class` for creating Datasets: [Case Class](https://docs.scala-lang.org/tour/case-classes.html)

[[Creating Datasets]]

#pitfalls 
The names of the fields in the Scala case class or Java class definition <mark style="background: #FFB8EBA6;">must match the order in the data source</mark>. The column names for each row in the data are automatically mapped to the corresponding names in the class and the types are automatically preserved.

[[Higher Order Functions and Datasets]]

## Converting DataFrames to Datasets
`df.as[SomeCaseClass]`


[[Memory Management for Datasets and DataFrames]]
[[Dataset Encoders]]
