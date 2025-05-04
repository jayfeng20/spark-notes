Application 
- A user program built on Spark using its APIs. It consists of a driver program and executors on the cluster. 
[[SparkSession]]
- An object that provides a point of entry to interact with underlying Spark functionality and allows programming Spark with its APIs. In an interactive Spark shell, the Spark driver instantiates a SparkSession for you, while in a Spark application, you create a SparkSession object yourself. 
[[Spark Job]]
- A parallel computation consisting of multiple tasks that gets spawned in response to a Spark action (e.g., save(), collect()). 
[[Spark Stage]] 
- Each job gets divided into smaller sets of tasks called stages that depend on each other. 
[[Spark Task ]]
- A single unit of work or execution that will be sent to a Spark executor.

![[Screenshot 2025-05-04 at 11.17.42 AM.png]]