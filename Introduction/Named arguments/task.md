## Named arguments

Make the function `joinOptions()` return the list in a JSON format (for example, `[a, b, c]`)
by specifying only two arguments. 

[Default and named](https://kotlinlang.org/docs/functions.html#default-arguments)
arguments help to minimize the number of overloads and improve the readability of the function invocation.
The library function [`joinToString`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html)
is declared with default values for parameters:

```kotlin
fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String
```

It can be called on a collection of Strings.
