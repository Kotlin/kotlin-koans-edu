## Introduction

This part was inspired by [GS Collections Kata](https://github.com/goldmansachs/gs-collections-kata).

Kotlin code can be easily mixed with Java code.
Default collections in Kotlin are Java collections under the hood.
Read about [read-only and mutable views on Java collections](https://kotlinlang.org/docs/reference/collections-overview.html#collection-types).

[Kotlin standard library](http://kotlinlang.org/api/latest/jvm/stdlib/kotlin/)
contains lots of extension functions that make the work with collections more convenient.
For example, operations that transform a collection to another one, starting with 'to':
[`toSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/to-set.html) or
[`toList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/to-list.html).

Implement an extension function `Shop.getSetOfCustomers()`.
The class `Shop` and all related classes can be found at `Shop.kt`.