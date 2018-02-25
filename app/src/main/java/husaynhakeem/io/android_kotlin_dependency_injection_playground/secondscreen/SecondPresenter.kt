package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import javax.inject.Inject

/**
 * Created by husaynhakeem on 2/24/18.
 */

class SecondPresenter @Inject constructor(private val view: SecondContract.View) : SecondContract.Presenter {

    @Inject
    fun setUpView() {
        view.setPresenter(this)
    }

    override fun start() {
        view.displayImage()
    }
}