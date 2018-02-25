package husaynhakeem.io.android_kotlin_dependency_injection_playground

/**
 * Created by husaynhakeem on 2/24/18.
 */

interface BaseView<P> {

    fun setPresenter(presenter: P)
}