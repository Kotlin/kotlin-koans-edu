import org.junit.Assert
import org.junit.Test

class TestProperties {
    @Test(timeout = 1000)
    fun testPropertyWithCounter() {
        val q = PropertyExample()
        q.propertyWithCounter = 14
        q.propertyWithCounter = 21
        q.propertyWithCounter = 32
        Assert.assertTrue("The property 'counter' should contain the number of assignments to 'propertyWithCounter'",
                3 == q.counter)
        Assert.assertTrue("The property 'propertyWithCounter' should store the value assigned to it", 32 == q.propertyWithCounter)
    }

}