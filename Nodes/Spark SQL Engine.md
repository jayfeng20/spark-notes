#core-concept #spark-sql

• Unifies Spark components and permits abstraction to DataFrames/Datasets in
Java, Scala, Python, and R, which simplifies working with structured data sets.
• Connects to the Apache Hive metastore and tables.
• Reads and writes structured data with a specific schema from structured file for‐
mats (JSON, CSV, Text, Avro, Parquet, ORC, etc.) and converts data into tempo‐
rary tables.
• Offers an interactive Spark SQL shell for quick data exploration.
• Provides a bridge to (and from) external tools via standard database JDBC/
ODBC connectors.
• Generates optimized query plans and compact code for the JVM, for final
execution.

![[Screenshot 2025-05-04 at 8.07.40 PM.png
## At the core of the Spark SQL engine are the [[Catalyst optimizer]] and [[Project Tungsten]].