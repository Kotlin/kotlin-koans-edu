import org.junit.Assert
import org.junit.Test

class Test {
    fun testAge(age: Int) {
        val e: IllegalArgumentException? = try {
            checkAge(age)
            null
        } catch (e: IllegalArgumentException) {
            e
        }
        Assert.assertNotNull(
                "Expected IllegalArgumentException for 'checkAge($age)'", e)
    }

    @Test(timeout = 1000)
    fun testNegative() = testAge(-10)

    @Test(timeout = 1000)
    fun testLargeNumber() = testAge(200)
}