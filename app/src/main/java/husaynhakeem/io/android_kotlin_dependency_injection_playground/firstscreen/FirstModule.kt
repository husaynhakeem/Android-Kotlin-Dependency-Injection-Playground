package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

const val FIRST_VIEW = "first_view"
const val MAGIC = "magic"
const val ANYTHING = "anything"

val firstModule: Module = applicationContext {
    factory { params -> FirstPresenter(params[FIRST_VIEW], get(MAGIC), get(ANYTHING)) as FirstContract.Presenter }
    bean(MAGIC) { "Show me some magic!" }
    bean(ANYTHING) { "Show me anything.." }
}