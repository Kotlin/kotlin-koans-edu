import org.junit.Assert
import org.junit.Test

class TestRangeTo {
    fun doTest(date: MyDate, first: MyDate, last: MyDate, shouldBeInRange: Boolean) {
        val message = "$date should${if (shouldBeInRange) "" else "n't"} be in range: $first..$last:\n"
        Assert.assertEquals(message, shouldBeInRange, checkInRange(date, first, last))
    }

    @Test(timeout = 1000)
    fun testInRange() {
        doTest(MyDate(2014, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = true)
    }

    @Test(timeout = 1000)
    fun testBefore() {
        doTest(MyDate(2013, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = false)
    }

    @Test(timeout = 1000)
    fun testAfter() {
        doTest(MyDate(2015, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = false)
    }
}