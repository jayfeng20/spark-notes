#api #core-concept 

# What is a Dataset
- a strongly typed collection of domain-specific objects that can be transformed in paral‐ lel using functional or relational operations. Each Dataset [in Scala] also has an unty‐ ped view called a DataFrame, which is a Dataset of Row.
![[Screenshot 2025-05-04 at 7.35.20 PM.png]]
Figure 3-1. Structured APIs in Apache Spark

#pitfalls 
In Spark’s supported languages, Datasets make sense only in Java and Scala, whereas in Python and R only DataFrames make sense. This is because Python and R are<mark style="background: #FFB8EBA6;"> not compile-time type-safe;</mark><mark style="background: #FFB8EBA6;"> types are dynamically inferred or assigned during execution, not during compile time.</mark>

In Scala, DF is just an alias for untyped `Dataset[Row]` 

![[Screenshot 2025-05-04 at 7.37.12 PM.png]]

[[Rows]]

## Creating a dataset
[[Creating Datasets]]

