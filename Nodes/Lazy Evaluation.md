The actions and transformations contribute to a [[Spark query plan]], which we will
cover in the next chapter. Nothing in a query plan is executed until an action is
invoked.

The following example, shown both in Python and Scala, has two transfor‐ mations—read() and filter()—and one action—count(). The action is what Transformations, Actions, and Lazy Evaluation | 29 triggers the execution of all transformations recorded as part of the query execution plan. In this example, nothing happens until filtered.count() is executed in the shell:![[Screenshot 2025-05-04 at 11.28.31 AM.png]]