#api #core-concept 
[[DataFrame]]

As mentioned previously, named columns in DataFrames are conceptually similar to named columns in pandas or R DataFrames or in an RDBMS table: they describe a type of field.

In Spark’s sup‐ ported languages, columns are <mark style="background: #FFB8EBA6;">objects with public methods (represented by the Column type)</mark>.
[Public Methods](https://oreil.ly/xVBIX)

#example 
## Columns in Spark

Note: `blogsDF` is a DataFrame constructed in `createSchema` files
![[Screenshot 2025-05-04 at 6.50.44 PM.png]]![[Screenshot 2025-05-04 at 6.54.06 PM.png]]

[Column Object Public Methods](https://oreil.ly/TZd3c)