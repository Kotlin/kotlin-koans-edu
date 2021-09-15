## Smart casts

Rewrite the following Java code using [smart casts](https://kotlinlang.org/docs/typecasts.html#smart-casts)
and the [when](https://kotlinlang.org/docs/control-flow.html#when-expression) expression:

```java
public int eval(Expr expr) {
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    throw new IllegalArgumentException("Unknown expression");
}
```
