import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestMaxMin {
    @Test(timeout = 1000)
    fun testCustomerWithMaximumNumberOfOrders() {
        Assert.assertTrue(errorMessage("getCustomerWithMaxOrders"),
                customers[reka] == shop.getCustomerWithMaxOrders())
    }

    @Test(timeout = 1000)
    fun testTheMostExpensiveOrderedProduct() {
        Assert.assertTrue(errorMessage("getMostExpensiveProductBy"),
                rubyMine == getMostExpensiveProductBy(customers[nathan]!!))
    }
}
