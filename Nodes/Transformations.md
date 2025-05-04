#core-concept
Transformations, as the name suggests, transform a Spark DataFrame into a new DataFrame without altering the original data, giving it the property of [[immutability]]. Put another way, an operation such as select() or filter() will not change the original DataFrame; instead, it will return the transformed results of the operation as a **new** [[DataFrame]].

2 types of Transformations
[[Narrow Transformations]]
[[Wide Transformations]]
![[Screenshot 2025-05-04 at 11.32.18 AM.png]]