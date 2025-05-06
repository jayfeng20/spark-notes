#api-functions #spark-sql 

```
-- In SQL 
transform(values, value -> lambda expression)
```

#performance 
The `transform()` function takes an array (values) and anonymous function (lambda expression) as input. The function transparently creates a new array by applying the anonymous function to each element, and then assigning the result to the output array (similar to the UDF approach, but <mark style="background: #FFB8EBA6;">more efficiently</mark>).

