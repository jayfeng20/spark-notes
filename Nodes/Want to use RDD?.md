#pitfalls 

• Are using a third-party package that’s written using RDDs 
• Can forgo the code optimization, efficient space utilization, and performance benefits available with DataFrames and Datasets 
• Want to precisely instruct Spark how to do a query


What’s more, you can seamlessly move between DataFrames or Datasets and RDDs at will using a simple API method call, df.rdd.