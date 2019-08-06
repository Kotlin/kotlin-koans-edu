## Sum

Implement a function that calculates the total amount of money the customer has spent:
the sum of the prices for all the products ordered by a given customer. 
Note that each product should be counted as many times as it was ordered.

Use
[`sum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum.html) or
[`sumBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum-by.html).
If you want to sum up double values, use
[`sumByDouble`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum-by-double.html).

```kotlin
listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumBy { it.length } == 4
```
