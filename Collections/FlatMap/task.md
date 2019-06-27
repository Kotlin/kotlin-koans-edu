## FlatMap

Read about [flattening](https://kotlinlang.org/docs/reference/collection-transformations.html#flattening).

Implement two functions using
[`flatMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/flat-map.html):
- the first one should return all products the given customer has ordered
- the second one should return all products that were ordered by at least one customer

```kotlin
val result = listOf("abc", "12").flatMap { it.toCharList() }
result == listOf('a', 'b', 'c', '1', '2')
```