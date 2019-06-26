## Nothing type

[Nothing type](https://kotlinlang.org/docs/reference/exceptions.html#the-nothing-type)
can be used as a return type for the function that always throws an exception.
When you call such function, the compiler uses the information that it throws an exception.

Specify `Nothing` return type for the `failWithWrongAge` function.
Without `Nothing` type the function doesn't compile
because the compiler assumes `age` can be `null`.