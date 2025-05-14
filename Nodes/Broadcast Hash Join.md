#performance #spark-sql #api-functions 

# BHJ, short for broadcast hash join

When the smaller to-be-joined table is smaller than `10 MB` in size, by default, it will be broadcasted as [[Broadcast Variable]] to all the Spark executors where it will then be joined with the larger table.

The BHJ is the **easiest and fastest join Spark offers**, since it **does not involve** any shuffle of the data set; just have to be sure that you have **enough memory both on the Spark driver’s and the executors’ side to hold the smaller data set in memory**.

#configuration 
This configuration is set in `spark.sql.autoBroadcastJoinThreshold`

#pitfalls 
If you are confident that you have enough memory you can use a broadcast join with DataFrames larger than 10 MB (even up to 100 MB).



![[Screenshot 2025-05-13 at 3.39.24 PM.png]]


# An example
```
// In Scala

import org.apache.spark.sql.functions.broadcast  
val joinedDF = playersDF.join(broadcast(clubsDF), "key1 === key2")
```

In this code we are forcing Spark to do a broadcast join, but it will resort to this type of join by default if the size of the smaller data set is below the `spark.sql.autoBroadcastJoinThreshold`.


#pitfalls 
# When to use?
Use this type of join under the following conditions for maximum benefit:

- When each key within the smaller and larger data sets is hashed to the same partition by Spark
    
- When one data set is much smaller than the other (and within the default config of 10 MB, or more if you have sufficient memory)
    
- When you only want to perform an equi-join, to combine two data sets based on matching unsorted keys
    
- When you are not worried by excessive network bandwidth usage or OOM errors, because the smaller data set will be broadcast to all Spark executors