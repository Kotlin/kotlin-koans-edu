import org.junit.Assert
import org.junit.Test

class Test {
    @Test(timeout = 1000)
    fun testSolution() {
        Assert.assertEquals(
                "The margin prefix shouldn't be present " +
                        "in the resulting string",
                tripleQuotedString,
                """question = "life, the universe, and everything"
answer = 42""")
    }
}