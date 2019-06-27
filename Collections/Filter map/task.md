## Filter; map

Read about [mapping](https://kotlinlang.org/docs/reference/collection-transformations.html#mapping) and 
[filtering](https://kotlinlang.org/docs/reference/collection-filtering.html#filtering-by-predicate) of a collection.

Implement the following extension functions
using the
[`map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/map.html) and
[`filter`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/filter.html) 
functions:
- finding all the different cities the customers are from
- finding customers living in the given city 

```kotlin
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```