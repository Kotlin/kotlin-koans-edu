## Sort

Read about
[collection ordering](https://kotlinlang.org/docs/reference/collection-ordering.html)
and the
[the difference](https://kotlinlang.org/docs/reference/collection-operations.html#write-operations)
between operations in-place on mutable collections and operations returning new collections. 

Implement the function returning a list of customers,
sorted in a descending order by the number of orders they made. 
Use
[`sortedDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-descending.html) or
[`sortedByDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-by-descending.html).

```kotlin
listOf("bbb", "a", "cc").sorted() == listOf("a", "bbb", "cc")
listOf("bbb", "a", "cc").sortedBy { it.length } == listOf("a", "cc", "bbb")
```