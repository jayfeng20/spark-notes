#performance 
#pitfalls 

instead of using lambda functions as arguments to functional methods like `filter` or `map`, it is recommended to use `DSL`:


# Instead of 
![[Screenshot 2025-05-06 at 5.35.05 PM.png]]
![[Screenshot 2025-05-06 at 5.35.21 PM.png]]

# Multiple serialization and deserialization occur
![[Screenshot 2025-05-06 at 5.36.00 PM.png]]

# Use:

![[Screenshot 2025-05-06 at 5.35.34 PM.png]]