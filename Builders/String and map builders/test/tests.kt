import org.junit.Assert
import org.junit.Test

class TestStringAndMapBuilders {
    @Test(timeout = 1000)
    fun testBuildMap() {
        val expected = hashMapOf<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        Assert.assertEquals("Wrong result for 'usage()' call:\n", expected, usage())
    }
}