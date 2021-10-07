## Data classes

Learn about [classes](https://kotlinlang.org/docs/classes.html),
[properties](https://kotlinlang.org/docs/properties.html)
and [data classes](https://kotlinlang.org/docs/data-classes.html)
and then rewrite the following Java code to Kotlin:

```java
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

Afterward, add the `data` modifier to the resulting class.
The compiler will generate a few useful methods for this class: `equals`/`hashCode`, `toString`, and some others.