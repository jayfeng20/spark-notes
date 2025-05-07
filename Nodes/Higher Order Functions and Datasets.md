#api-functions #performance #pitfalls 
[[Higher Order Functions]]

• We are using typed JVM objects as arguments to functions.
• We are using dot notation (from object-oriented programming) to access indi‐ vidual fields within the typed JVM object, making it easier to read.
• Some of our functions and lambda signatures can be type-safe, ensuring compile- time error detection and instructing Spark what data types to work on, what operations to perform, etc.
• Our code is readable, expressive, and concise, using Java or Scala language fea‐ tures in lambda expressions.
• Spark provides the equivalent of map() and filter() without higher-order func‐ tional constructs in both Java and Scala, so you are not forced to use functional programming with Datasets or DataFrames. Instead, you can simply use condi‐ tional DSL operators or SQL expressions: for example, dsUsage.filter("usage > 900") or dsUsage($"usage" > 900). (For more on this, see “Costs of Using Datasets” on page 170.)
• For Datasets we use encoders, a mechanism to efficiently convert data between JVM and Spark’s internal binary format for its data types (more on that in “Data‐ set Encoders” on page 168).