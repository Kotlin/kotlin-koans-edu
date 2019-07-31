## Invoke

Objects with an [`invoke()`](https://kotlinlang.org/docs/reference/operator-overloading.html#invoke)
method can be invoked as a function.

You can add an `invoke` extension for any class, but it's better not to overuse it:

```kotlin
fun Int.invoke() { println(this) }

1() //huh?..
```

Implement the function `Invokable.invoke()` so it can count the number of times it is invoked.
