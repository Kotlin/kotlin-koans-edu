import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestOperatorsOverloading {
    @Test(timeout = 1000)
    fun testAddOneTimeInterval() {
        Assert.assertEquals(errorMessage("task1"), MyDate(2015, 5, 8), task1(MyDate(2014, 5, 1)))
    }

    @Test(timeout = 1000)
    fun testOneMonth() {
        Assert.assertEquals(errorMessage("task2"), MyDate(2016, 0, 27), task2(MyDate(2014, 0, 1)))
    }

    @Test(timeout = 1000)
    fun testMonthChange() {
        Assert.assertEquals(errorMessage("task2"), MyDate(2016, 1, 20), task2(MyDate(2014, 0, 25)))
    }
}
