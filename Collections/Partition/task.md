## Partition

Learn about [partitioning](https://kotlinlang.org/docs/reference/collection-filtering.html#partitioning)
and the [destructuring declaration](http://kotlinlang.org/docs/reference/multi-declarations.html)
syntax that is often used together with `partition`.

Then implement a function for returning customers who have more undelivered orders
than delivered orders using
[`partition`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/partition.html).

```kotlin
val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) =
    numbers.partition { it > 0 }

positive == listOf(1, 3, 2)
negative == listOf(-4, -11)
```
