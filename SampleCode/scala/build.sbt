// Name of the package
name := "main/scala/demo"
// Version of package
version := "1.0"
// Version of Scala
scalaVersion := "2.12.20"
// Spark library dependencies
libraryDependencies ++= Seq(
 "org.apache.spark" %% "spark-core" % "3.5.5",
 "org.apache.spark" %% "spark-sql" % "3.5.5"
)