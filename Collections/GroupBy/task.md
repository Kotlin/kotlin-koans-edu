## Group By

Read about [grouping](https://kotlinlang.org/docs/reference/collection-grouping.html).
Using
[`groupBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/group-by.html)
implement the function building the map that stores the customers living in the given city.

```kotlin
val result = 
    listOf("a", "b", "ba", "ccc", "ad")
        .groupBy { it.length }

result == mapOf(
    1 to listOf("a", "b"),
    2 to listOf("ba", "ad"),
    3 to listOf("ccc"))
```