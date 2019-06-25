## Filter; map

Implement extension functions `Shop.getCitiesCustomersAreFrom()` and `Shop.getCustomersFrom()` using functions
[`map`](map) and
[`filter`](filter).

```kotlin
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```