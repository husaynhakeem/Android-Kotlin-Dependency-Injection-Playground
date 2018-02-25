package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import com.nhaarman.mockito_kotlin.argumentCaptor
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Created by husaynhakeem on 2/24/18.
 */

class FirstPresenterShould {

    private val message = "Show me some magic!"
    private val anotherMessage = "Show me anything.."

    private lateinit var presenter: FirstPresenter
    private val view = mock(FirstContract.View::class.java)
    private val captor = argumentCaptor<String>()

    @Before
    fun setUp() {
        presenter = FirstPresenter(view)
        presenter.message = message
        presenter.anotherMessage = anotherMessage
    }

    @Test
    fun showMessage_whenStarted() {
        presenter.start()

        verify(view).showMessage(captor.capture())
        assertTrue(captor.firstValue == message || captor.firstValue == anotherMessage)
    }

    @Test
    fun showSecondScreenWithMagicImage_whenMagicMessageIsClicked() {
        presenter.onMessageClicked(message)

        verify(view).showSecondScreen(MessageType.MAGIC)
    }

    @Test
    fun showSecondScreenWithAnythingImage_whenAnotherMessageIsClicked() {
        presenter.onMessageClicked(anotherMessage)

        verify(view).showSecondScreen(MessageType.ANOTHER)
    }
}