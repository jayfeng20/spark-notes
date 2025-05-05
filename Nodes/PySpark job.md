#example #configuration #spark-setup 
[[SampleCode]]
- navigate to `SampleCode/` directory and find `mnmcount.py`
- find the dataset under `data/`
- submit it as a Spark job using the submit-spark script in the installation’s bin directory. Set your SPARK_HOME environment variable to the root-level directory where you installed Spark on your local machine.
- now you're ready to submit the [[Spark job]] via terminal
- Note: reduce log verbosity by changing `$SPARK_HOME/conf/log4j2.properties`
	- set `rootLogger.level = warn`

```
cd SampleCode/ # SampleCode in a directory in this notebook
$SPARK_HOME/bin/spark-submit python/mnmcount.py data/mnm_dataset.csv
```
