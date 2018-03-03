package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

class SecondPresenter(private val view: SecondContract.View) : SecondContract.Presenter {

    override fun start() {
        view.displayImage()
    }
}