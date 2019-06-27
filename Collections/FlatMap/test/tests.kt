import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestFlatMap {
    @Test fun testGetOrderedProductsSet() {
        Assert.assertEquals(errorMessage("Customer.getOrderedProducts"),
                listOf(idea, idea, idea), customers[reka]?.getOrderedProducts())
    }

    @Test fun testGetAllOrderedProducts() {
        Assert.assertTrue(errorMessage("Shop.getOrderedProducts"),
                orderedProducts == shop.getOrderedProducts())
    }
}
