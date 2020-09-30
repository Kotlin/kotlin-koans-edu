## The function apply

The previous examples can be rewritten using the library function
[`apply`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/apply.html).
Write your own implementation of this function named 'myApply'.

```kotlin
val adam = Person("Adam").apply {
    age = 32
    city = "London"        
}
println(adam)
```

```kotlin
var currentStockValue = 0.0
val inventory = HashMap<Product, Int>().apply {
    put(Product("IntelliJ IDEA Ultimate", 199.0), 2)
    put(Product("ReSharper", 149.0), 5)
    put(Product("DotTrace", 129.0), 100)
    put(Product("DotCover", 99.0), 0)
    forEach { p, q -> currentStockValue += q * p.price }
}
print("Stock value is $currentStockValue\n")
```

Learn about the other [scope functions](https://kotlinlang.org/docs/reference/scope-functions.html)
and how to use them.
