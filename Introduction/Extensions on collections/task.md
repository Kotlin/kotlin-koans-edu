## Extension functions on collections

Kotlin code can be easily mixed with Java code.
Thus in Kotlin we don't introduce our own collections, but use standard Java ones (slightly improved).
Read about [read-only and mutable views on Java collections](https://kotlinlang.org/docs/reference/collections-overview.html#collection-types).

[Kotlin standard library](http://kotlinlang.org/api/latest/jvm/stdlib/kotlin/)
contains lots of extension functions that make the work with collections more convenient.
Rewrite the previous example once more using an extension function
[`sortedDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sorted-descending.html).