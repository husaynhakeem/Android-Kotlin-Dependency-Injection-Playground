package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import husaynhakeem.io.android_kotlin_dependency_injection_playground.BasePresenter
import husaynhakeem.io.android_kotlin_dependency_injection_playground.BaseView

interface FirstContract {

    interface View : BaseView {
        fun showMessage(message: String)
        fun showSecondScreen(messageType: MessageType)
    }

    interface Presenter : BasePresenter {
        fun onMessageClicked(message: String)
    }
}