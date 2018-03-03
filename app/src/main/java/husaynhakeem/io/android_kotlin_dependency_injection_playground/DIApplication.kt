package husaynhakeem.io.android_kotlin_dependency_injection_playground

import android.app.Application
import husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen.firstModule
import husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen.secondModule
import org.koin.android.ext.android.startKoin

class DIApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(applicationModule, firstModule, secondModule))
    }
}