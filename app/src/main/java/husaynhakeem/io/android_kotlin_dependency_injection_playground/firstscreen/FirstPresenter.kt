package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import java.util.*
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by husaynhakeem on 2/24/18.
 */

class FirstPresenter @Inject constructor(private val view: FirstContract.View) : FirstContract.Presenter {

    @field:[Inject Named("magic")]
    lateinit var message: String

    @field:[Inject Named("anything")]
    lateinit var anotherMessage: String

    @Inject
    fun setUpView() {
        view.setPresenter(this)
    }

    override fun start() {
        when(Random().nextInt(2)) {
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