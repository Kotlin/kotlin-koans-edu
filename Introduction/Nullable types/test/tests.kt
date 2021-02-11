import org.junit.Test
import org.junit.Assert

class TestNullableTypes {
    fun testSendMessageToClient(
            client: Client?,
            message: String?,
            expectedEmail: String? = null,
            shouldBeInvoked: Boolean = false
    ) {
        var invoked = false
        val expectedMessage = message
        sendMessageToClient(client, message, object : Mailer {
            override fun sendMessage(email: String, message: String) {
                invoked = true
                Assert.assertEquals("The message is not as expected:",
                        expectedMessage, message)
                Assert.assertEquals("The email is not as expected:",
                        expectedEmail, email)
            }
        })
        Assert.assertEquals("The function 'sendMessage' should${if (shouldBeInvoked) "" else "n't"} be invoked",
                shouldBeInvoked, invoked)
    }

    @Test(timeout = 1000)
    fun everythingIsOk() {
        testSendMessageToClient(Client(PersonalInfo("bob@gmail.com")),
                "Hi Bob! We have an awesome proposition for you...",
                "bob@gmail.com",
                true)
    }

    @Test(timeout = 1000)
    fun noMessage() {
        testSendMessageToClient(Client(PersonalInfo("bob@gmail.com")), null)
    }

    @Test(timeout = 1000)
    fun noEmail() {
        testSendMessageToClient(Client(PersonalInfo(null)), "Hi Bob! We have an awesome proposition for you...")
    }

    @Test(timeout = 1000)
    fun noPersonalInfo() {
        testSendMessageToClient(Client(null), "Hi Bob! We have an awesome proposition for you...")
    }

    @Test(timeout = 1000)
    fun noClient() {
        testSendMessageToClient(null, "Hi Bob! We have an awesome proposition for you...")
    }
}