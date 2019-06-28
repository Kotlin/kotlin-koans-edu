import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test
import java.util.*

class TestGenericFunctions {
    @Test fun testPartitionWordsAndLines() {
        partitionWordsAndLines()

        val (words, lines) = listOf("a", "a b", "c", "d e").
                partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
        Assert.assertEquals(errorMessage("partitionTo"), listOf("a", "c"), words)
        Assert.assertEquals(errorMessage("partitionTo"), listOf("a b", "d e"), lines)
    }

    @Test fun testPartitionLettersAndOtherSymbols() {
        partitionLettersAndOtherSymbols()

        val (letters, other) = setOf('a', '%', 'r', '}').
                partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
        Assert.assertEquals(errorMessage("partitionTo"), setOf('a', 'r'), letters)
        Assert.assertEquals(errorMessage("partitionTo"), setOf('%', '}'), other)
    }
}