#core-concept #configuration 

# First way of changing conf: conf files

There are a number of config files: `conf/spark-defaults.conf.template`, `conf/ log4j.properties.template`, and `conf/spark-env.sh.template`. Changing the default values in these files and saving them without the `.template` suffix instructs Spark to use these new values.

#pitfalls 
Configuration changes in the `conf/spark-defaults.conf` file apply to the Spark cluster and all Spark applications submitted to the cluster.

# Second way of changing conf: command line and in app 

The second way is to specify Spark configurations directly in your Spark application or on the command line when submitting the application with `spark-submit`, using the `--conf` flag:

![[Screenshot 2025-05-07 at 6.51.25 PM.png]]
## You can also do it in the Spark application itself
![[Screenshot 2025-05-07 at 6.52.17 PM.png]]
# Third way of. changing conf: view it in a spark session

![[Screenshot 2025-05-07 at 6.54.41 PM.png]]![[Screenshot 2025-05-07 at 6.55.02 PM.png]]

#spark-ui 
# Fourth way: Spark UI
![[Screenshot 2025-05-07 at 6.55.50 PM.png]]

#pitfalls 
To set or modify an existing configuration programmatically, first check if the property is modifiable. `spark.conf.isModifiable("<config_name>")` will return true or false. All modifiable configs can be set to new values using the API

#pitfalls 
Among all the ways that you can set Spark properties, an order of precedence deter‐ mines which values are honored. Any values or flags defined in `spark-defaults.conf` will be read first, followed by those supplied on the command line with spark- submit, and finally those set via SparkSession in the Spark application.