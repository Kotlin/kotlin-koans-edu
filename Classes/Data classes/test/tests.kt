import org.junit.Assert
import org.junit.Test

class TestDataClasses {
    @Test fun testListOfPeople() {
        Assert.assertEquals("The class Person is implemented incorrectly\n",
                "[Person(name=Alice, age=29), Person(name=Bob, age=31)]",
                getPeople().toString())
    }
}