## Sum

Implement the function that calculates the sum of prices of all products
that the given customer has ordered.
Note that the customer may order the same product for several times.

Use
[`sum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum.html) or
[`sumBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum-by.html).
If you want to sum up the double values, use
[`sumByDouble`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum-by-double.html).

```kotlin
listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumBy { it.length } == 4
```
