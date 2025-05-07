#api #api-functions #reference 

See`SampleCode/scala/DatasetDemo.scala`

#pitfalls 
As with creating DataFrames from data sources, when creating a Dataset you have to
know the schema. In other words, you need to know the data types. Although with
JSON and CSV data it’s possible to infer the schema, for large data sets this is
resource-intensive (expensive).

For Scala, use `case class`

If a JSON file looks like:

![[Screenshot 2025-05-04 at 7.44.28 PM.png]]


**To express each JSON entry as DeviceIoTData, a domain-specific object, we can define a Scala case class:**![[Screenshot 2025-05-04 at 7.45.23 PM.png]]


**Then enforce the schema when reading the data:**
![[Screenshot 2025-05-04 at 7.46.33 PM.png]]
