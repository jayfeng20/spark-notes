 #configuration #spark-setup 

need to use SBT ([Scala Build Tool](https://www.scala-sbt.org/))

Sample SBT file under `SampleCode/scala/build.sbt`
code file is `SampleCode/scala/mnmcount.scala`

## Packaging the Scala Spark Job
if you have `JAVA_HOME` and `SCALA_HOME` both set
you could package by running
```
sbt clean package
```

After a successful build, you can run the Scala version of the M&M count example as follows (jar file is compiled for you): 

- **Command**: `$SPARK_HOME/bin/spark-submit`
    
- **Main Class**: `main.scala.chapter2.mnmcount`
    
- **JAR File**: `target/scala-2.12/main-scala-chapter2_2.12-1.0.jar`
    
- **Input Data**: `data/mnm_dataset.csv`

```
$SPARK_HOME/bin/spark-submit \
--class main.scala.chapter2.MnMcount \
target/scala-2.12/main-scala-chapter2_2.12-1.0.jar \
../data/mnm_dataset.csv
```