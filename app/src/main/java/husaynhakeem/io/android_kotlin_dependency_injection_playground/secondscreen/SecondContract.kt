package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import husaynhakeem.io.android_kotlin_dependency_injection_playground.BasePresenter
import husaynhakeem.io.android_kotlin_dependency_injection_playground.BaseView

/**
 * Created by husaynhakeem on 2/24/18.
 */

interface SecondContract {

    interface View : BaseView<Presenter> {
        fun displayImage()
    }

    interface Presenter : BasePresenter
}