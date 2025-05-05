#core-concept #api #example #api-functions 
[[DataFrame]]
Note: `Row` is a generic object type in Spark -> `Dataset[T]`

A row in Spark is a generic Row object, containing one or more columns. Each column may be of the same data type (e.g., integer or string), or they can have different types (integer, string, map, array, etc.). 

Because Row is an object in Spark and an ordered collection of fields, you can instantiate a Row in each of Spark’s supported languages and access its fields by an index starting at 0:![[Screenshot 2025-05-04 at 6.58.14 PM.png]]

Row objects can be used to create DataFrames if you need them for quick interactivity and exploration:
![[Screenshot 2025-05-04 at 6.58.32 PM.png]]

## Row is just a collection of elements whose type is "to-be-inferred":

![[Screenshot 2025-05-04 at 7.41.34 PM.png]]