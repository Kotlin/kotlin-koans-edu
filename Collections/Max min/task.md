## Max min

Learn about [Collection Aggregate Operations](https://kotlinlang.org/docs/reference/collection-aggregate.html).

Implement two functions:
- the first should return the customer who has placed the most amount of orders in this shop 
- the second should return the most expensive product that has been ordered by the given customer

The functions
[`max`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/max.html),
[`min`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/min.html),
[`maxBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/max-by.html), and
[`minBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/min-by.html)
might be helpful.

```kotlin
listOf(1, 42, 4).max() == 42
listOf("a", "ab").minBy(String::length) == "a"
```

You can use [callable references](https://kotlinlang.org/docs/reference/lambdas.html#instantiating-a-function-type)
instead of lambdas. This can be especially helpful in call chains, where
`it` occurs in different lambdas and has different types.
Implement the `getMostExpensiveProductBy` function using callable references.  
