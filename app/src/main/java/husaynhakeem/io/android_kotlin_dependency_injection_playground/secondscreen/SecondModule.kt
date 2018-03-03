package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

const val SECOND_VIEW = "second_view"

val secondModule : Module = applicationContext {
    factory { params -> SecondPresenter(params[SECOND_VIEW]) as SecondContract.Presenter }
}