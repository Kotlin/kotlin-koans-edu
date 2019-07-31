## Associate

Learn about [association](https://kotlinlang.org/docs/reference/collection-transformations.html#association).
Implement the following functions using 
[`associateBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate.html),
[`associateWith`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate-with.html), 
and [`associate`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate-by.html):

- Build a map from the customer name to the customer
- Build a map from the customer to their city 
- Build a map from the customer name to their city

```kotlin
val list = listOf("abc", "cdef")

list.associateBy { it.first() } == 
        mapOf('a' to "abc", 'c' to "cdef")

list.associateWith { it.length } == 
        mapOf("abc" to 3, "cdef" to 4)

list.associate { it.first() to it.length } == 
        mapOf('a' to 3, 'c' to 4)
```
