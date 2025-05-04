`groupBy()` or `orderBy()` instruct Spark to perform **wide** transformations,
where data from other partitions is read in, combined, and written to disk. Since each
partition will have its own count of the word that contains the “Spark” word in its row
of data, a count (groupBy()) will force a shuffle of data from each of the executor’s
partitions across the cluster. In this transformation, orderBy() requires output from
other partitions to compute the final aggregation.