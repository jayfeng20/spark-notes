These APIs allow you to extract or transform features, build pipelines (for training and evaluating), and persist models (for saving and reloading them) during deploy‐ ment. Additional utilities include the use of common linear algebra operations and statistics. MLlib includes other low-level ML primitives, including a generic gradient descent optimization.


```
# In Python from pyspark.ml.classification import LogisticRegression 

... 

training = spark.read.csv("s3://...") test = spark.read.csv("s3://...") 

# Load training data 
lr = LogisticRegression(maxIter=10, regParam=0.3, elasticNetParam=0.8) 

# Fit the model lrModel = lr.fit(training) 
# Predict lrModel.transform(test) 

...
```