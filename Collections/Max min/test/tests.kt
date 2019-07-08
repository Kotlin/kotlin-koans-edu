import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestMaxMin {
    @Test fun testCustomerWithMaximumNumberOfOrders() {
        Assert.assertTrue(errorMessage("getCustomerWithMaxOrders"),
                customers[reka] == shop.getCustomerWithMaxOrders())
    }

    @Test fun testTheMostExpensiveOrderedProduct() {
        Assert.assertTrue(errorMessage("getMostExpensiveProductBy"),
                rubyMine == getMostExpensiveProductBy(customers[nathan]!!))
    }
}
