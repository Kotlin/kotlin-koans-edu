## For loop

A Kotlin [for loop](https://kotlinlang.org/docs/control-flow.html#for-loops)
can iterate through any object if the corresponding `iterator` member or extension function is available.

Make the class `DateRange` implement [`Iterable<MyDate>`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/),
so that it can be iterated over.
Use the function `MyDate.followingDate()` defined in `DateUtil.kt`;
you don't have to implement the logic for finding the following date on your own.

Use an [object expression](https://kotlinlang.org/docs/object-declarations.html#object-expressions)
which plays the same role in Kotlin as an anonymous class in Java. 
