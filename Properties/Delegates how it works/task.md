## Delegates

You can declare your own [delegates](https://kotlinlang.org/docs/delegated-properties.html#property-delegate-requirements).
Implement the methods of the class `EffectiveDate` so you can delegate to it.
Store only the time in milliseconds in the `timeInMillis` property.

Use the extension functions `MyDate.toMillis()` and `Long.toDate()`, defined in
`MyDate.kt`.
