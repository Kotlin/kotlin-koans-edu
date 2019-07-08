import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestAllAnyAndOtherPredicates {

    @Test(timeout = 1000)
    fun testAllCustomersAreFromCity() {
        Assert.assertFalse(errorMessage("checkAllCustomersAreFrom"), shop.checkAllCustomersAreFrom(Canberra))
    }

    @Test(timeout = 1000)
    fun testAnyCustomerIsFromCity() {
        Assert.assertTrue(errorMessage("hasCustomerFrom"), shop.hasCustomerFrom(Canberra))
    }

    @Test(timeout = 1000)
    fun testCountCustomersFromCity() {
        Assert.assertTrue(errorMessage("countCustomersFrom"), 2 == shop.countCustomersFrom(Canberra))
    }

    @Test(timeout = 1000)
    fun testAnyCustomerFromCity() {
        Assert.assertTrue(errorMessage("findCustomerFrom"), customers[lucas] == shop.findCustomerFrom(Canberra))
    }
}
