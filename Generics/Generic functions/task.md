## Generic functions

Learn about [generic functions](https://kotlinlang.org/docs/reference/generics.html#generic-functions).
Make the code compile by implementing a `partitionTo` function that splits
a collection into two collections according to the predicate.

There is a [`partition()`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/partition.html)
function in the standard library that always returns two newly created lists.
You should write a function with three parameters: the two collections and a predicate. The function should split the collection into two collections given as arguments using the given predicate and return a `Pair` containing the resulting collections.
The signature of the
[`toCollection()`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/to-collection.html)
 function from the standard library might help you.
