## Extension functions

Learn about [extension functions](http://kotlinlang.org/docs/reference/extensions.html).
Then implement the extension functions `Int.r()` and `Pair.r()` and make them convert Int and Pair to a `RationalNumber`.

`Pair` is a class defined in the standard library:

```kotlin
data class Pair<out A, out B>(
    val first: A,
    val second: B
)
```
