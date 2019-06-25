## Sort

Implement `Shop.getCustomersSortedByNumberOfOrders()` using
[`sorted`](sorted) or
[`sortedBy`](sorted-by).

```kotlin
listOf("bbb", "a", "cc").sorted() == listOf("a", "bbb", "cc")
listOf("bbb", "a", "cc").sortedBy { it.length } == listOf("a", "cc", "bbb")
```