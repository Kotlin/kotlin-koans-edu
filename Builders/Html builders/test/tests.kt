import org.junit.Assert
import org.junit.Test

class TestHtmlBuilders {
    @Test(timeout = 1000)
    fun productTableIsFilled() {
        val result = renderProductTable()
        Assert.assertTrue("Product table should contain the corresponding data", result.contains("cactus"))
    }

    @Test(timeout = 1000)
    fun productTableIsColored() {
        val result = renderProductTable()
        Assert.assertTrue("Product table should be colored", result.contains("bgcolor"))
    }
}
