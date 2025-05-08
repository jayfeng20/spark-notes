#performance #pitfalls 
When you specify compute resources as command-line arguments to spark-submit, as we did earlier, you cap the limit. This means that if more resources are needed later as tasks queue up in the driver due to a larger than anticipated workload, Spark can‐ not accommodate or allocate extra resources.

# Dynamic Resource Allocation
Use Spark's [dynamic resource allocation configuration](https://oreil.ly/FX8wl) the Spark driver can request more or fewer compute resources as the demand of large workloads flows and ebbs. In scenarios where your workloads are dynamic—that is, they vary in their demand for compute capacity—using dynamic allocation helps to accommodate sud‐ den peaks.

# Use Cases

- streaming, where the data flow volume may be uneven.
- on-demand data analytics, where you might have a high volume of SQL queries during peak hours.
- [multitenant environment](https://oreil.ly/Hqtip): Spark may be deployed alongside other applications or services in YARN, Mesos, or Kubernetes. Be advised, however, that Spark’s shifting resource demands may impact other applications demanding resources at the same time.

# Some examples
```
spark.dynamicAllocation.enabled true
spark.dynamicAllocation.minExecutors 2
spark.dynamicAllocation.schedulerBacklogTimeout 1m
spark.dynamicAllocation.maxExecutors 20
spark.dynamicAllocation.executorIdleTimeout 2min
```

By default spark.dynamicAllocation.enabled is set to false. When enabled with the settings shown here, the Spark driver will request that the cluster manager create two executors to start with, as a minimum (`spark.dynamicAllocation.minExecutors`). As the task queue backlog increases, new executors will be requested each time the backlog timeout (spark.dynamicAllocation.schedulerBacklogTimeout) is exceeded. In this case, whenever there are pending tasks that have not been scheduled for over 1 minute, the driver will request that a new executor be launched to schedule backlogged tasks, up to a maximum of 20 (`spark.dynamicAllocation.maxExecutors`). By contrast, if an executor finishes a task and is idle for 2 minutes (spark.dynamicAllocation.executorIdleTimeout), the Spark driver will terminate it.