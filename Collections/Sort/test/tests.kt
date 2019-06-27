import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestSort {
    @Test
    fun testGetCustomersSortedByNumberOfOrders() {
        val errorMessage = errorMessage("getCustomersSortedByNumberOfOrders")
        val actual = shop.getCustomersSortedByOrders()
        Assert.assertTrue(errorMessage, 6 == actual.size)
        Assert.assertTrue(errorMessage, customers[reka] == actual[0])
        Assert.assertTrue(errorMessage, customers[lucas] == actual[1])
        Assert.assertTrue(errorMessage, customers[cooper] == actual[5])
        Assert.assertTrue(errorMessage, setOf(customers[nathan], customers[bajram], customers[asuka]) ==
                actual.subList(2, 5).toSet())
    }
}
