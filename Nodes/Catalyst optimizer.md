#spark-sql 
The Catalyst optimizer takes a computational query and converts it into an execution
plan. it goes through [Four transformational Phases](https://oreil.ly/jMDOi)

1. Analysis
2. Logical optimization
3. Physical planning
4. Code generation

[[4 Transformational Phases]]


![[Screenshot 2025-05-04 at 8.10.41 PM.png]]


## Consider the following example

![[Screenshot 2025-05-04 at 8.11.55 PM.png]]
![[Screenshot 2025-05-04 at 8.12.00 PM.png]]

#api-functions 
To see the different stages the Python code goes through, you can use the `df.explain(True)` method on the DataFrame.

![[Screenshot 2025-05-04 at 8.13.34 PM.png]]

# Another Example

[[An Catalyst Optimizer Example]]