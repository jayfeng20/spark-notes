#api  #api-functions


#pitfalls 
Spaces in column names can be problematic, especially when you want to write or save a DataFrame as a Parquet file (which prohibits this).

By specifying the desired column names in the schema <mark style="background: #FFB8EBA6;">with StructField</mark>, as we did, we effectively<mark style="background: #FFB8EBA6;"> changed all names in the resulting DataFrame</mark>.

## `withColumnRenamed()`

![[Screenshot 2025-05-04 at 7.21.09 PM.png]]

## Change type format of a column

For example when `datetime` arrives in `str` which is not ideal

Use `to_timestamp()` and `to_date()`

![[Screenshot 2025-05-04 at 7.23.38 PM.png]]
## Once they are in the correct timestamp or date format

Use `year()/month()/day()` to select

![[Screenshot 2025-05-04 at 7.27.01 PM.png]]