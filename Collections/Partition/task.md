## Partition
Implement `Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered()` using
[`partition`](partition).

```kotlin
val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) = numbers.partition { it > 0 }
positive == listOf(1, 3, 2)
negative == listOf(-4, -11)
```

Note that [destructuring declaration](destructuring_declarations) syntax is used in this example.