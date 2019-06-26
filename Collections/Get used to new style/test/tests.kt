import org.junit.Test
import org.junit.Assert

class TestExtensionsOnCollections {
    @Test fun testCollectionOfOneElement() {
        doTest(listOf("a"), listOf("a"))
    }

    @Test fun testSimpleCollection() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c"))
    }

    @Test fun testCollectionWithEmptyStrings() {
        doTest(listOf("", "", "", ""), listOf("", "", "", "", "a", "bb", "ccc", "dddd"))
    }

    @Test fun testCollectionWithTwoGroupsOfMaximalSize() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c", "dd"))
    }

    private fun doTest(expected: Collection<String>?, argument: Collection<String>) {
        Assert.assertEquals(
                "Wrong result for 'doSomethingStrangeWithCollection()' call on " +
                        "${argument.joinToString(prefix = "[", postfix = "]") { "\"$it\"" }}:\n",
                expected, doSomethingStrangeWithCollection(argument))
    }
}