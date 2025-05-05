#api #core-concept 
[[Columns and Expressions]]
[[Rows]]

A schema in Spark defines the column names and associated data types for a [[DataFrame]].

## Three benefits

• You relieve Spark from the onus of inferring data types.
• You prevent Spark from creating a separate job just to read a large portion of
your file to ascertain the schema, which for a large data file can be expensive and
time-consuming.
• You can detect errors early if data doesn’t match the schema.


## Defining a schema

Spark allows you to define a schema in two ways. One is to define it <mark style="background: #FFB8EBA6;">programmati‐ cally</mark>, and the other is to employ a <mark style="background: #FFB8EBA6;">Data Definition Language (DDL) string</mark>, which is much simpler and easier to read.

### Method 1: Programmatic
![[Screenshot 2025-05-04 at 6.33.50 PM.png]]

### Method 2: DDL
![[Screenshot 2025-05-04 at 6.34.13 PM.png]]

#example 
Some sample code for a quick application in both PySpark and Scala Spark could be found under [[SampleCode]] `SampleCode/[language]/createSchema.scala or .py`
