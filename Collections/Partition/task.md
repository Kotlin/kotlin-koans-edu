## Partition

Learn about [partitioning](https://kotlinlang.org/docs/collection-filtering.html#partition)
and the [destructuring declaration](https://kotlinlang.org/docs/destructuring-declarations.html)
syntax that is often used together with `partition`.

Then implement a function for returning customers who have more undelivered orders
than delivered orders using
[`partition`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html).

```kotlin
val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) =
    numbers.partition { it > 0 }

positive == listOf(1, 3, 2)
negative == listOf(-4, -11)
```
