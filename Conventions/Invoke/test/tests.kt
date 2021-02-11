import org.junit.Assert
import org.junit.Test

class TestInvoke {
    @Test(timeout = 1000)
    fun testInvokeTwice() = testInvokable(2, ::invokeTwice)

    private fun testInvokable(numberOfInvocations: Int, invokeSeveralTimes: (Invokable) -> Invokable) {
        val invokable = Invokable()
        val message = "The number of invocations is incorrect:\n"
        Assert.assertEquals(message, numberOfInvocations, invokeSeveralTimes(invokable).numberOfInvocations)
    }

    @Test(timeout = 1000)
    fun testNumberOfInvocations() {
        testInvokable(1) { it() }
        testInvokable(5) { it()()()()() }
        testInvokable(0) { it }
    }
}
