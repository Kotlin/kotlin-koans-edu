## Getting used to the new style

We can rewrite and simplify the following code using lambdas and operations on collections.
Fill in the gaps in `doSomethingWithCollection`, 
the simplified version of the `doSomethingWithCollectionOldStyle` function, 
so that its behavior stays the same and isn't modified in any way.

```kotlin
fun doSomethingWithCollectionOldStyle(
    collection: Collection<String>
): Collection<String>? {
    val groupsByLength = mutableMapOf<Int, MutableList<String>>()
    for (s in collection) {
        var strings: MutableList<String>? = groupsByLength[s.length]
        if (strings == null) {
            strings = mutableListOf()
            groupsByLength[s.length] = strings
        }
        strings.add(s)
    }

    var maximumSizeOfGroup = 0
    for (group in groupsByLength.values) {
        if (group.size > maximumSizeOfGroup) {
            maximumSizeOfGroup = group.size
        }
    }

    for (group in groupsByLength.values) {
        if (group.size == maximumSizeOfGroup) {
            return group
        }
    }
    return null
}
```
