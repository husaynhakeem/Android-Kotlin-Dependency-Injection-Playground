package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import java.util.*

class FirstPresenter(
        private val view: FirstContract.View,
        private val message: String,
        private val anotherMessage: String) : FirstContract.Presenter {

    override fun start() {
        when (Random().nextInt(2)) {
            0 -> view.showMessage(message)
            1 -> view.showMessage(anotherMessage)
        }
    }

    override fun onMessageClicked(message: String) {
        if (message == this.message)
            view.showSecondScreen(MessageType.MAGIC)
        else if (message == anotherMessage)
            view.showSecondScreen(MessageType.ANOTHER)
    }
}