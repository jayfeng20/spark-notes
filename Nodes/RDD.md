#core-concept #api #example 

A fundamental abstraction of a simple logical data structure.

Higher level. structured data abstractions such as [[DataFrames]] and Datasets are constructed on top of RDD.

The RDD is the most basic abstraction in Spark. There are three vital characteristics
associated with an RDD:
- Dependencies
- Partitions (with some locality information)
- Compute function: Partition => Iterator[T]

#pitfalls 
Problems with the RDD model:
- the compute function (or computation) is opaque to Spark. That is, Spark does not know what you are doing in the compute function. Whether you are performing a join, filter, select, or aggregation, Spark only sees it as a lambda expression.
-  the Iterator[T] data type is also opaque for Python RDDs; Spark only knows that it’s a generic object in Python
- because it’s unable to inspect the computation or expression in the function, Spark has no way to optimize the expression—it has no comprehension of its intention
- Spark has no knowledge of the specific data type in T. To Spark it’s an opaque object; it has no idea if you are accessing a column of a certain type within an object. Therefore, all Spark can do is serialize the opaque object as a series of bytes, without using any data compression techniques.

below is a not-so-good looking example of using RDD
![[Screenshot 2025-05-04 at 6.13.03 PM.png]]