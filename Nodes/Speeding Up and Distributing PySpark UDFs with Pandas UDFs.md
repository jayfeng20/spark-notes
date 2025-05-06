#spark-sql #performance #pitfalls 

See [Pandas UDFs](https://oreil.ly/jo7kl) for more info

## Why is Pandas UDFs needed

- PySpark UDFs had slower performance than Scala UDFs because the PySpark UDFs required <mark style="background: #FFB8EBA6;">data movement between the JVM and Python,</mark> which was quite expensive.
- A Pandas UDF uses Apache Arrow to transfer data and Pandas to work with the data.
- Once the data is in Apache Arrow format, there is no longer the need to serialize/pickle the data as it is already in a format consumable by the Python process. (Spark can **pass entire columns (or batches)** in a highly efficient binary format—no need for serializing/deserializing each row.)
- Once in Python, operations happen in **Pandas**, which is written in **highly optimized C code** under the hood.

# In simpler terms
#performance 
- before
	- Spark (JVM) has to serialize each row of data into a format the Python process can understand
	- python process then deserializes the data
	- After processing, the **Python process serializes** the result row-by-row.
	- Back in **JVM**, Spark **deserializes** each result row.
- With Pandas UDF
	- Spark (JVM) uses Arrow to **serialize batches of data at once** (columnar, binary format).
	- **Python process reads Arrow format directly** using PyArrow + Pandas (no deserialization needed in the traditional sense).
	- After processing, results are **converted back to Arrow format**.
	- JVM reads Arrow **without full deserialization** per row.


[[Pandas UDF APIs]]