import org.junit.Test
import org.junit.Assert

class TestSmartCasts {
    @Test
    fun testIsLeapDate() {
        Assert.assertEquals(true, isLeapDay(MyDate(2024, 2, 29)))
    }

    @Test
    fun testIsNotLeapDate() {
        Assert.assertEquals(false, isLeapDay(MyDate(2021, 1, 30)))
    }
}
