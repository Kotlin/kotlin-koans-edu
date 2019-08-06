## Sort

Learn about
[collection ordering](https://kotlinlang.org/docs/reference/collection-ordering.html)
and the
[the difference](https://kotlinlang.org/docs/reference/collection-operations.html#write-operations)
between operations in-place on mutable collections and operations returning new collections. 

Implement a function for returning the list of customers,
sorted in descending order by the number of orders they have made. 
Use
[`sortedDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-descending.html) or
[`sortedByDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-by-descending.html).

```kotlin
val strings = listOf("bbb", "a", "cc")
strings.sorted() ==
        listOf("a", "bbb", "cc")

strings.sortedBy { it.length } ==
        listOf("a", "cc", "bbb")

strings.sortedDescending() ==
        listOf("cc", "bbb", "a")

strings.sortedByDescending { it.length } ==
        listOf("bbb", "cc", "a")
```
