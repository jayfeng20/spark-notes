#api #api-functions 


## To find the most common types of fire calls
## `groupBy()`, `orderBy()`, `count()`
![[Screenshot 2025-05-04 at 7.29.00 PM.png]]![[Screenshot 2025-05-04 at 7.29.05 PM.png]]

#pitfalls 

`.collect()` is dangerous to use for large datasets due to fatal `OOM (Out of Memory)` error. 
So use `.take(n)` for take a peak at the dataframe rows instead