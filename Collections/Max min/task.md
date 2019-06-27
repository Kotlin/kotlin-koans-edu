## Max; min

Read about [Collection Aggregate Operations](https://kotlinlang.org/docs/reference/collection-aggregate.html).

Implement two functions:
- the first one should return a customer who has placed the maximum amount of orders in this shop 
- the second one should return the most expensive product that has been ordered by the given customer

The functions
[`max`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/max.html),
[`min`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/min.html),
[`maxBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/max-by.html), and
[`minBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/min-by.html)
might be helpful.

```kotlin
listOf(1, 42, 4).max() == 42
listOf("a", "ab").minBy { it.length } == "a"
```
