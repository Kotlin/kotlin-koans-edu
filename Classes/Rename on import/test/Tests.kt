import org.junit.Assert
import org.junit.Test

class Test {
    @Test(timeout = 1000)
    fun testRandom() {
        val string = useDifferentRandomClasses()
        Assert.assertTrue(
                "The string should contain random numbers 0 or 1\n$string",
                setOf('0', '1').any { it in string })
    }
}