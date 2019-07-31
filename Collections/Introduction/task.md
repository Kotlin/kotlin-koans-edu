## Introduction

This section was inspired by [GS Collections Kata](https://github.com/goldmansachs/gs-collections-kata).

Kotlin can be easily mixed with Java code.
Default collections in Kotlin are all Java collections under the hood.
Learn about [read-only and mutable views on Java collections](https://kotlinlang.org/docs/reference/collections-overview.html#collection-types).

The [Kotlin standard library](http://kotlinlang.org/api/latest/jvm/stdlib/kotlin/)
contains lots of extension functions that make working with collections more convenient.
For example, operations that transform a collection into another one, starting with 'to':
[`toSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/to-set.html) or
[`toList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/to-list.html).

Implement the extension function `Shop.getSetOfCustomers()`.
The class `Shop` and all related classes can be found in `Shop.kt`.
