#core-concept #performance 
[[Caching SQL Tables]]

[[cache()]]
[[persist()]]

# When to Cache and Persist

Common use cases for caching are scenarios where you will want to access a large data set repeatedly for queries or transformations. Some examples include:
- DataFrames commonly used during iterative machine learning training
- DataFrames accessed commonly for doing frequent transformations during ETL or building data pipelines

# When Not to Cache and Persist

Not all use cases dictate the need to cache. Some scenarios that may not warrant caching your DataFrames include:
- DataFrames that are too big to fit in memory
- An inexpensive transformation on a DataFrame not requiring frequent use, regardless of size

As a general rule you should use memory caching judiciously, as it can incur resource costs in serializing and deserializing, depending on the `StorageLevel` used.

