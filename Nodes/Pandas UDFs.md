#api #spark-sql #spark-3 

With Apache Spark 3.0, Pandas UDFs infer the Pandas UDF type from Python
type hints in Pandas UDFs such as pandas.Series, pandas.DataFrame, Tuple,
and Iterator. Previously you needed to manually define and specify each Pan‐
das UDF type. Currently, the supported cases of Python type hints in Pandas
UDFs are Series to Series, Iterator of Series to Iterator of Series, Iterator of Multiple Series to Iterator of Series, and Series to Scalar (a single value).

#reference 
check [Full Documentation](https://docs.databricks.com/aws/en/udf/panda)

## To Create an UDF
![[Screenshot 2025-05-05 at 5.15.03 PM.png]]

The preceding code snippet declares a function called cubed() that performs a cubed operation. This is a regular Pandas function with the additional cubed_udf = pan das_udf() call to create our Pandas UDF.

## To use
![[Screenshot 2025-05-05 at 5.16.04 PM.png]]


[[Pandas UDFs Result In the Execution of Spark Jobs]]