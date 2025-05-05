#spark-sql 
Spark only manages the metadata, while you manage the data yourself in an external data source such as `Cassandra`.
- a SQL command such as `DROP TABLE table_name` deletes <mark style="background: #FFB8EBA6;">only the metadata</mark>