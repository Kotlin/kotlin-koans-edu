## Fold

Implement `Shop.getSetOfProductsOrderedByEveryCustomer()` using
[`fold`](fold).

```kotlin
listOf(1, 2, 3, 4).fold(1, {
    partProduct, element ->
    element * partProduct
}) == 24
```
