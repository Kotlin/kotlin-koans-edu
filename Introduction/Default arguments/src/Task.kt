fun foo(name: String, number: Int = 42, upperCase: Boolean = false) =
        (if (upperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", upperCase = true),
        foo(name = "d", number = 2, upperCase = true)
)
