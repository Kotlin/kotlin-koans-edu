## All, Any, and other predicates

Learn about [testing predicates](https://kotlinlang.org/docs/collection-filtering.html#test-predicates)
and [retrieving elements by condition](https://kotlinlang.org/docs/collection-elements.html#retrieve-by-condition).

Implement the following functions using
[`all`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html),
[`any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html),
[`count`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/count.html),
[`find`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html):

* `checkAllCustomersAreFrom` should return true if all customers are from a given city
* `hasCustomerFrom` should check if there is at least one customer from a given city
* `countCustomersFrom` should return the number of customers from a given city
* `findCustomerFrom` should return a customer who lives in a given city, or `null` if there is none

```kotlin
val numbers = listOf(-1, 0, 2)
val isZero: (Int) -> Boolean = { it == 0 }
numbers.any(isZero) == true
numbers.all(isZero) == false
numbers.count(isZero) == 1
numbers.find { it > 0 } == 2
```
