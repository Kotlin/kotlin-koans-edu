## All, Any and other predicates

Implement all the functions below using
[`all`](all),
[`any`](any),
[`count`](count),
[`find`](find).

```kotlin
val numbers = listOf(-1, 0, 2)
val isZero: (Int) -> Boolean = { it == 0 }
numbers.any(isZero) == true
numbers.all(isZero) == false
numbers.count(isZero) == 1
numbers.find { it > 0 } == 2
```