## Extension functions

Read about [extension functions](http://kotlinlang.org/docs/reference/extensions.html).
Then implement extension functions `Int.r()` and `Pair.r()` and make them convert Int and Pair to `RationalNumber`.

`Pair` is a class defined in the standard library:

```
data class Pair<out A, out B>(
    val first: A,
    val second: B
)
```