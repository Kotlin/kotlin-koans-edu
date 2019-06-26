import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        Assert.assertEquals(
                "The margin prefix shouldn't be present " +
                        "in the resulting string",
                tripleQuotedString,
"""Tell me and I forget.
Teach me and I remember.
Involve me and I learn.
(Benjamin Franklin)""")
    }
}