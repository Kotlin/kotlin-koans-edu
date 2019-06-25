## FlatMap

Implement `Customer.getOrderedProducts()` and `Shop.getAllOrderedProducts()` using
[`flatMap`](flat-map).

```kotlin
val result = listOf("abc", "12").flatMap { it.toCharList() }
result == listOf('a', 'b', 'c', '1', '2')
```