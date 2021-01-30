import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestAssociate {
    @Test(timeout = 1000)
    fun testAssociateBy() {
        val expected = customers.values.associateBy { it.name }
        val actual = shop.nameToCustomerMap()
        Assert.assertTrue(errorMessage("nameToCustomerMap"),
                expected == actual)
    }

    @Test(timeout = 1000)
    fun testAssociateWith() {
        val expected = customers.values.associateWith { it.city }
        val actual = shop.customerToCityMap()
        Assert.assertTrue(errorMessage("customerToCityMap"),
                expected == actual)
    }

    @Test(timeout = 1000)
    fun testAssociate() {
        val expected = customers.values.associate { it.name to it.city }
        val actual = shop.customerNameToCityMap()
        Assert.assertTrue(errorMessage("customerNameToCityMap"),
                expected == actual)
    }
}