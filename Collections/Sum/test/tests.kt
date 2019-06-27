import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestSum {
    @Test fun testGetTotalOrderPrice() {
        Assert.assertTrue(errorMessage("getTotalOrderPrice"), moneySpentBy(customers[nathan]!!) == 148.0)
    }
}
