## Default arguments

Imagine you have several overloads of 'foo()' in Java:

```java
public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}
```

You can replace all these Java overloads with one function in Kotlin.
Change the declaration of the `foo` function in a way that makes the code using `foo` compile.
Use [default and named](https://kotlinlang.org/docs/functions.html#default-arguments) arguments.
