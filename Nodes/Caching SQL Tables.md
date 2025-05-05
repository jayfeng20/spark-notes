#spark-sql 

Like DataFrames, you can cache and uncache SQL tables and views.
In Spark 3.0, in addition to other options, you can specify a table as `LAZY`, meaning
that it should only be cached when it is first used instead of immediately:

```
-- In SQL
CACHE [LAZY] TABLE <table-name>
UNCACHE TABLE <table-name>
```