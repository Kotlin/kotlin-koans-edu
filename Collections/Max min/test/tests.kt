import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestMaxMin {
    @Test fun testCustomerWithMaximumNumberOfOrders() {
        Assert.assertTrue(errorMessage("getCustomerWithMaximumNumberOfOrders"),
                customers[reka] == shop.getCustomerWithMaxOrders())
    }

    @Test fun testTheMostExpensiveOrderedProduct() {
        Assert.assertTrue(errorMessage("getMostExpensiveOrderedProduct"),
                rubyMine == getMostExpensiveProductBy(customers[nathan]!!))
    }
}
