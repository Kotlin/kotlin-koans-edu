import org.junit.Test
import org.junit.Assert

class TestExtensionFunctions() {
    @Test(timeout = 1000)
    fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
    }

    @Test(timeout = 1000)
    fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
    }
}