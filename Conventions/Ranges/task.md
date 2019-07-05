## Ranges

Using [ranges](http://kotlinlang.org/docs/reference/ranges.html)
implement the function that checks whether the date belongs to a range
from the first date to the last date (inclusive).

You can build a range of any comparable elements.
In Kotlin [`in` checks](https://kotlinlang.org/docs/reference/operator-overloading.html#in)
are translated to the corresponding `contains` calls
and [`..`](https://kotlinlang.org/docs/reference/operator-overloading.html#arithmetic)
to `rangeTo` calls:

```kotlin
val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")

date1..date2 // date1.rangeTo(date2)
```