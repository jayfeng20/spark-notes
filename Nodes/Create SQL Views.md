#spark-sql #api #api-functions 

# Create Views
- global view: visible across all SparkSessions on a given cluster
- session-scoped: visible only to a single SparkSession
- they disappear after your Spark application terminates

## Create view with `spark.sql`
![[Screenshot 2025-05-04 at 11.09.56 PM.png]]

## Create view with DataFrame's API
![[Screenshot 2025-05-04 at 11.10.54 PM.png]]

#pitfalls 
- Global views created live inside a special database called `global_temp` so you must use the prefix `global_temp.<view_name>`
- Regular temp views do not need the prefix

# TempView vs GlobalTempView
[[TempView vs GlobalTempView]]

# View vs Table
- They can be queried similarly
- views don’t actually hold the data
- tables persist after your Spark application terminates, but views disappear

