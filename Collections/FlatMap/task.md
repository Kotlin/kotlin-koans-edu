## FlatMap

Learn about [flattening](https://kotlinlang.org/docs/collection-transformations.html#flatten)
and implement two functions using
[`flatMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flat-map.html):
- The first should return all products the given customer has ordered
- The second should return all products that were ordered by at least one customer

```kotlin
val result = listOf("abc", "12")
    .flatMap { it.toList() }

result == listOf('a', 'b', 'c', '1', '2')
```
