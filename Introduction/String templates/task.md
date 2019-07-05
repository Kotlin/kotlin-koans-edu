## String templates

Triple-quoted strings are useful not only for multi-line strings, but also
for creating regex patterns. You don't need to escape a backslash by a backslash.

The following pattern matches a date in format `13.06.1992`
(two digits, a dot, two digits, a dot, four digits):

```kotlin
fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
```

Using `month` variable rewrite this pattern in such a way that it matches the date in format `13 JUN 1992`
(two digits, a whitespace, a month abbreviation, a whitespace, four digits).