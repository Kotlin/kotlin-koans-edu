## Triple-quoted strings

Learn about the [different string literals and string templates](http://kotlinlang.org/docs/reference/basic-types.html#string-literals)
in Kotlin.

You can use the handy library functions 
[`trimIndent`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/trim-indent.html)
and [`trimMargin`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/trim-margin.html)
to format multiline triple-quoted strings
in accordance with the surrounding code.

Replace the `trimIndent` call with the `trimMargin` call
taking `#` as the prefix value, so that the resulting string doesn't contain
the prefix character.
