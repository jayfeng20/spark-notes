#api #api-functions #example 
![[Screenshot 2025-05-04 at 7.48.09 PM.png]]

`filter()` is an overloaded method with many signatures. The version we used, `filter(func: (T) > Boolean): Dataset[T]`, takes a lambda function, `func: (T) > Boolean`, as its argument.

#pitfalls 
In DataFrame, you express your `filter()` condtions as SQL-like DSL operations, which are language-agnostic.
With Datasets, use <mark style="background: #FFB8EBA6;">language-native expressions </mark>as Scala or Java code:

![[Screenshot 2025-05-04 at 7.50.56 PM.png]]![[Screenshot 2025-05-04 at 7.51.07 PM.png]]

**Instead of `.map()` then `.toDF()`, do**

```
[DeviceTempByCountry(d.temp, d.device_name, d.device_id, d.cca3)](<val dsTemp = ds
  .filter(_.temp %3E 25)
  .map(d => DeviceTempByCountry(d.temp, d.device_name, d.device_id, d.cca3))>)
```


**Other operations**

`filter(), map(), groupBy(), select(), take()`, etc.—are similar to the ones on DataFrames.

#pitfalls #performance 

When we use Datasets, the underlying Spark SQL engine handles the creation, con‐ version, serialization, and deserialization of the JVM objects. It also takes care of off Java heap memory management with the help of Dataset encoders.
**It gives better performance!!**