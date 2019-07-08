import org.junit.Assert
import org.junit.Test

class TestLazyProperty {
    @Test(timeout = 1000)
    fun testLazy() {
        var initialized = false
        val lazyProperty = LazyProperty { initialized = true; 42 }
        Assert.assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazy
        Assert.assertTrue("Property should be initialized after access", initialized)
        Assert.assertTrue("Property should be initialized after access", 42 == result)
    }

    @Test(timeout = 1000)
    fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyProperty { initialized++; 42 }
        lazyProperty.lazy
        lazyProperty.lazy
        Assert.assertEquals("Lazy property should be initialized only once", 1, initialized)

    }
}
