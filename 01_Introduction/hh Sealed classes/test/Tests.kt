import org.junit.Assert
import org.junit.Test

class TestSealedClasses {
    @Test(timeout = 1000)
    fun testNum() {
        Assert.assertEquals("'eval' on Num(2) works incorrectly\n", 2, eval(Num(2)))
    }

    @Test(timeout = 1000)
    fun testSum() {
        Assert.assertEquals("'eval' on Sum(Num(2), Num(1)) works incorrectly\n", 3, eval(Sum(Num(2), Num(1))))
    }

    @Test(timeout = 1000)
    fun testRecursion() {
        Assert.assertEquals("'eval' on Sum(Sum(Num(1), Num(2)), Num(3)) works incorrectly\n", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
}