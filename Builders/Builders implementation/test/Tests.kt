import org.junit.Assert
import org.junit.Test

class HtmlDslTest {
    @Test(timeout = 1000)
    fun testSample() {
        Assert.assertEquals(
                "Wrong result for createTable()",
                "<table><tr><td></td><td></td></tr></table>",
                createTable().toString())
    }

    @Test(timeout = 1000)
    fun testTable1() {
        Assert.assertEquals(
                "Wrong result for 'table { tr { td {} } }'",
                "<table><tr><td></td></tr></table>",
                table { tr { td {} } }.toString()
        )
    }

    @Test(timeout = 1000)
    fun testTable2() {
        Assert.assertEquals(
                "Wrong result for 'repeat(3) { tr { td {} } }'",
                "<table><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr></table>",
                table {
                    repeat(3) {
                        tr { td {} }
                    }
                }.toString()
        )
    }
}