## Named arguments

[Default and named](default_and_named)
arguments help to minimize the number of overloads and improve the readability of the function invocation.
The library function [`joinToString`](join_to_string)
is declared with default values for parameters:

```
fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String
```

It can be called on a collection of Strings.
Specifying only two arguments make the function `joinOptions()` return the list in a JSON format (e.g., "[a, b, c]")