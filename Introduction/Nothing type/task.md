## Nothing type

[Nothing type](https://kotlinlang.org/docs/reference/exceptions.html#the-nothing-type)
can be used as a return type for a function that always throws an exception.
When you call such a function, the compiler uses the information that it throws an exception.

Specify `Nothing` return type for the `failWithWrongAge` function.
Note that without the `Nothing` type the `checkAge` function doesn't compile
because the compiler assumes the `age` can be `null`.
