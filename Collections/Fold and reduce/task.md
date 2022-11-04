## Fold and reduce

Learn about [fold and reduce](https://kotlinlang.org/docs/collection-aggregate.html#fold-and-reduce)
and [set-specific operations](https://kotlinlang.org/docs/set-operations.html)
and implement a function that returns the set of products that all the customers ordered using [`reduce`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reduce.html).

You can use the `Customer.getOrderedProducts()` defined in the previous task (copy its implementation).

```kotlin
listOf(1, 2, 3, 4)
    .fold(1) { partProduct, element ->
        element * partProduct
    } == 24
```
<div class="hint">

You might also need the 
[intersect](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/intersect.html) function. 
</div>
