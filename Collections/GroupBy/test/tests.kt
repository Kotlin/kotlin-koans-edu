import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestGroupBy {
    @Test(timeout = 1000)
    fun testGroupCustomersByCity() {
        Assert.assertTrue(errorMessage("groupCustomersByCity"),
                groupedByCities == shop.groupCustomersByCity())
    }
}
