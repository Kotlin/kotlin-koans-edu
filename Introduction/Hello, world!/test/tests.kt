import org.junit.Assert
import org.junit.Test

class TestStart {
    @Test(timeout = 1000)
    fun testOk() {
        Assert.assertEquals("OK", start())
    }
}