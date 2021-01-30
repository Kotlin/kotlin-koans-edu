import org.junit.Assert
import org.junit.Test
import java.util.HashMap

class TestTheFunctionWith {
    @Test(timeout = 1000)
    fun testCreateString() {
        val sb = StringBuilder()
        sb.append("Numbers: ")
        for (i in 1..10) {
            sb.append(i)
        }
        Assert.assertEquals("Wrong result for 'createString()' call:\n", sb.toString(), createString())
    }

    @Test(timeout = 1000)
    fun testCreateMap() {
        val map = createMap()
        val expected = HashMap<Int, String>()
        for (i in 0..10) {
            expected[i] = "$i"
        }
        Assert.assertEquals("Wrong result for 'createMap()' call:\n", expected, map)
    }
}
