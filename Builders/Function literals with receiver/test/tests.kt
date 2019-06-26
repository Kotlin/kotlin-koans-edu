import org.junit.Assert
import org.junit.Test

class TestExtensionFunctionLiterals {
    @Test fun testIsOddAndIsEven() {
        Assert.assertEquals("Wrong results for 'isOdd' and 'isEven' calls:\n",
                listOf(false, true, true), task())

    }
}