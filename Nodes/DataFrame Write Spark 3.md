#spark-3 #data-source

Staring spark-3, when interacting with `delta` or `iceberg` especially, it is highly recommended to use `writeTo()`

```
df.writeTo("my_table").using("delta").createOrReplace()
```