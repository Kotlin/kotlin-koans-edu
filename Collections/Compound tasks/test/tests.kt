import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class K_Compound_Tasks {

    @Test(timeout = 1000)
    fun testMostExpensiveDeliveredProduct() {
        val testShop = shop("test shop for 'most expensive delivered product'",
                customer(lucas, Canberra,
                        order(idea, isDelivered = false),
                        order(reSharper)
                )
        )
        Assert.assertTrue(errorMessage("findMostExpensiveProductBy"), reSharper == findMostExpensiveProductBy(testShop.customers[0]))
    }

    @Test(timeout = 1000)
    fun testNumberOfTimesEachProductWasOrdered() {
        Assert.assertTrue(errorMessage("getNumberOfTimesProductWasOrdered"), 3 == shop.getNumberOfTimesProductWasOrdered(reSharper))
    }
}
