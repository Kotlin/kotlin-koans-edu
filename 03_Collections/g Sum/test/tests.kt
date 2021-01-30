import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestSum {
    @Test(timeout = 1000)
    fun testGetTotalOrderPrice() {
        Assert.assertTrue(errorMessage("moneySpentBy"), moneySpentBy(customers[nathan]!!) == 148.0)
    }

    @Test(timeout = 1000)
    fun testGetTotalOrderPrice1() {
        Assert.assertTrue(errorMessage("moneySpentBy") +
                "The product ordered several times should be counted as many times as it was ordered",
                moneySpentBy(customers[lucas]!!) == 586.0)
    }
}
