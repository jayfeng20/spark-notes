#core-concept #pitfalls #performance 

# Transfer data between Spark SQL and a JDBC external source
- make sure to **partition** your data

All of your data is going through one driver connection, which can saturate and significantly slow down the performance of your extraction, as well as potentially saturate the resources of your source system.

# Highly Recommended Settings
While these JDBC properties are optional, for any large-scale operations it is highly recommended to use the properties shown in Table 5-2.
![[Screenshot 2025-05-05 at 5.52.04 PM.png]]
#performance #pitfalls 
While not all-encompassing, the following are some hints to keep in mind when
using these properties:
• A good starting point for numPartitions is to use a multiple of the number of
Spark workers. For example, if you have four Spark worker nodes, then perhaps
start with 4 or 8 partitions. But it is also important to note how well your source
system can handle the read requests. For systems that have processing windows,
you can maximize the number of concurrent requests to the source system; for
systems lacking processing windows (e.g., an OLTP system continuously process‐
ing data), you should reduce the number of concurrent requests to prevent satu‐
ration of the source system.
• Initially, calculate the lowerBound and upperBound based on the minimum and
maximum partitionColumn actual values. For example, if you choose
{numPartitions:10, lowerBound: 1000, upperBound: 10000}, but all of the
values are between 2000 and 4000, then only 2 of the 10 queries (one for each
partition) will be doing all of the work. In this scenario, a better configuration
would be {numPartitions:10, lowerBound: 2000, upperBound: 4000}.
• Choose a partitionColumn that can be uniformly distributed to avoid data skew.
For example, if the majority of your partitionColumn has the value 2500, with
{numPartitions:10, lowerBound: 1000, upperBound: 10000} most of the
work will be performed by the task requesting the values between 2000 and 3000.
Instead, choose a different partitionColumn, or if possible generate a new one
(perhaps a hash of multiple columns) to more evenly distribute your partitions.