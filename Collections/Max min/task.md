## Max min

Learn about [collection aggregate operations](https://kotlinlang.org/docs/collection-aggregate.html).

Implement two functions:

* The first should return the customer who has placed the most amount of orders in this shop 
* The second should return the most expensive product that the given customer has ordered

The functions
[`maxOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max-or-null.html),
[`minOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/min-or-null.html),
[`maxByOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max-by-or-null.html), and
[`minByOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/min-by-or-null.html)
might be helpful.

```kotlin
listOf(1, 42, 4).maxOrNull() == 42
listOf("a", "ab").minByOrNull(String::length) == "a"
```

You can use [callable references](https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type)
instead of lambdas. It can be especially helpful in call chains, where
`it` occurs in different lambdas and has different types.
Implement the `getMostExpensiveProductBy` function using callable references.  
