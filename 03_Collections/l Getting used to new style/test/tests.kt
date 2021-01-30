import org.junit.Test
import org.junit.Assert

class TestExtensionsOnCollections {
    @Test(timeout = 1000)
    fun testCollectionOfOneElement() {
        doTest(listOf("a"), listOf("a"))
    }

    @Test(timeout = 1000)
    fun testSimpleCollection() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c"))
    }

    @Test(timeout = 1000)
    fun testCollectionWithEmptyStrings() {
        doTest(listOf("", "", "", ""), listOf("", "", "", "", "a", "bb", "ccc", "dddd"))
    }

    @Test(timeout = 1000)
    fun testCollectionWithTwoGroupsOfMaximalSize() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c", "dd"))
    }

    private fun doTest(expected: Collection<String>?, argument: Collection<String>) {
        Assert.assertEquals(
                "Wrong result for 'doSomethingStrangeWithCollection()' call on " +
                        "${argument.joinToString(prefix = "[", postfix = "]") { "\"$it\"" }}:\n",
                expected, doSomethingWithCollection(argument))
    }
}