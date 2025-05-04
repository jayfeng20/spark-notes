Any transformation where a single output partition can be computed from a single input partition is a narrow transformation.

![[Screenshot 2025-05-04 at 11.31.20 AM.png]]
For example, filter() and contains() represent narrow transformations because they can operate on a single partition and produce the resulting output partition without any exchange of data.