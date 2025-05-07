package main.scala.demo

import org.apache.spark.sql.SparkSession
import scala.util.Random._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.Dataset


object DatasetDemo extends App {
  val spark = SparkSession
    .builder
    .appName("DatasetDemo")
    .getOrCreate()

  // When creating a Dataset using case class, need to import implicit encoders
  import spark.implicits._
  case class Usage(uid: Int, uname: String, usage: Int)

  val r = new scala.util.Random(42)

  val data = for (i <- 1 to 1000000)
    yield (Usage(i, "user-" + r.alphanumeric.take(5).mkString(""), r.nextInt(1000000)))

  // Create the Dataset
  val dsUsage = spark.createDataset(data)

  val top10: Array[Usage] = dsUsage
    .filter(u => u.usage > 900000)
    .orderBy(desc("usage"))
    .show(10)

  // use scala built-in functions to compute the cost
  def computeCostUsage(usage: Int): Double = {
    if (usage < 100000) 0.0
    else if (usage < 500000) 0.1
    else if (usage < 900000) 0.2
    else if (usage < 1000000) 0.3
    else 0.4
  }

  val dsCost = dsUsage
    .map(u => (u.uid, u.uname, computeCostUsage(u.usage)))
}