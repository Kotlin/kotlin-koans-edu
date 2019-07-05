## Rename on import

When you [import](https://kotlinlang.org/docs/reference/packages.html#imports)
a class or a function, you can specify a different name by which you want to use it
by adding `as NewName` after the import directive.
That might be useful when you want to use two classes or functions with similar names
from different libraries.

Uncomment the code and make it compile.
Rename `Random` from kotlin package to `KRandom`,
and `Random` from java package to JRandom.  