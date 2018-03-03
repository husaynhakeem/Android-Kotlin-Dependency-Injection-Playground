package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import husaynhakeem.io.android_kotlin_dependency_injection_playground.BasePresenter
import husaynhakeem.io.android_kotlin_dependency_injection_playground.BaseView

interface SecondContract {

    interface View : BaseView {
        fun displayImage()
    }

    interface Presenter : BasePresenter
}