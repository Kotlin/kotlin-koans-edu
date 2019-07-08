import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestFilterMap {
    @Test
    fun testCitiesCustomersAreFrom() {
        Assert.assertTrue(errorMessage("getCustomerCities"),
                setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo) == shop.getCustomerCities())
    }

    @Test
    fun testCustomersFromCity() {
        Assert.assertTrue(errorMessage("getCustomersFrom"),
                listOf(customers[lucas], customers[cooper]) == shop.getCustomersFrom(Canberra))
    }
}
