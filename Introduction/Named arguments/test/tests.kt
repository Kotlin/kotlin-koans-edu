import koans.util.errorMessage
import org.junit.Test
import org.junit.Assert

class TestNamedArguments {

    @Test(timeout = 1000)
    fun testJoinToString() {
        Assert.assertEquals(errorMessage("joinOptions"), "[yes, no, may be]", joinOptions(listOf("yes", "no", "may be")))
    }

}