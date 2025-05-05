#spark-sql #pitfalls 

Spark SQL (this includes SQL, the DataFrame API, and the Dataset API) does not
guarantee the order of evaluation of subexpressions. For example, the following query does not guarantee that the `s is NOT NULL` clause is executed prior to the `strlen(s) 1 clause`:
```
spark.sql("SELECT s FROM test1 WHERE s IS NOT NULL AND strlen(s) > 1")
```
<mark style="background: #FFB8EBA6;">Our goal is to run `strlen()` on all test1 values that are not `NULL` but since the order of execution is not guaranteed, the above expression is buggy.</mark>

Therefore, to perform proper null checking, it is recommended that you do the
following:
1. Make the UDF itself null-aware and do null checking inside the UDF.
2. Use IF or CASE WHEN expressions to do the null check and invoke the UDF in a
conditional branch.