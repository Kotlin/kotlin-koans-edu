## Fold

Learn about [fold and reduce](https://kotlinlang.org/docs/collection-aggregate.html#fold-and-reduce)
and implement a function that returns the set of products that all the customers ordered using [`fold`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/fold.html).

You can use the `Customer.getOrderedProducts()` defined in the previous task (copy its implementation).

```kotlin
listOf(1, 2, 3, 4)
    .fold(1) { partProduct, element ->
        element * partProduct
    } == 24
```
