## Invoke

Objects with the [`invoke()`](https://kotlinlang.org/docs/operator-overloading.html#invoke-operator)
method can be invoked as a function.

You can add an `invoke` extension for any class, but it's better not to overuse it:

```kotlin
operator fun Int.invoke() { println(this) }

1() //huh?..
```

Implement the function `Invokable.invoke()` to count the number of times it is invoked.
