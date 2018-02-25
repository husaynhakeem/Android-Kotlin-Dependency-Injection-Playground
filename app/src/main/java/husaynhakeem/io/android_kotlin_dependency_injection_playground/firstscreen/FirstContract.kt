package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import husaynhakeem.io.android_kotlin_dependency_injection_playground.BasePresenter
import husaynhakeem.io.android_kotlin_dependency_injection_playground.BaseView

/**
 * Created by husaynhakeem on 2/24/18.
 */

interface FirstContract {

    interface View : BaseView<Presenter> {
        fun showMessage(message: String)
        fun showSecondScreen(messageType: MessageType)
    }

    interface Presenter : BasePresenter {
        fun onMessageClicked(message: String)
    }
}