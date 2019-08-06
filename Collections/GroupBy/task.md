## Group By

Learn about [grouping](https://kotlinlang.org/docs/reference/collection-grouping.html).
Use
[`groupBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/group-by.html)
to implement the function to build a map that stores the customers living in a given city.

```kotlin
val result = 
    listOf("a", "b", "ba", "ccc", "ad")
        .groupBy { it.length }

result == mapOf(
    1 to listOf("a", "b"),
    2 to listOf("ba", "ad"),
    3 to listOf("ccc"))
```
