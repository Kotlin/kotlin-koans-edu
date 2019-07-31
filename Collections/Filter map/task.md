## Filter; map

Learn about [mapping](https://kotlinlang.org/docs/reference/collection-transformations.html#mapping) and 
[filtering](https://kotlinlang.org/docs/reference/collection-filtering.html#filtering-by-predicate) a collection.

Implement the following extension functions
using the
[`map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/map.html) and
[`filter`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/filter.html) 
functions:
- Find all the different cities the customers are from.
- Find the customers living in a given city.

```kotlin
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```
