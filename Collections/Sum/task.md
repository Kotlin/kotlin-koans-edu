## Sum

Implement a function that calculates the total amount of money the customer has spent:
the sum of the prices for all the products ordered by a given customer. 
Note that each product should be counted as many times as it was ordered.

Use
[`sum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum.html) or 
[`sumOf`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum-of.html), if you want to sum up double values.

```kotlin
listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumOf { it.length } == 4
```
