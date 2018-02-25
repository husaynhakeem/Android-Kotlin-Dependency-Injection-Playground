package husaynhakeem.io.android_kotlin_dependency_injection_playground

import android.app.Application

/**
 * Created by husaynhakeem on 2/24/18.
 */

class DIApplication : Application() {

    val component: DIApplicationComponent by lazy {
        DaggerDIApplicationComponent.builder()
                .dIApplicationModule(DIApplicationModule(this))
                .build()
    }
}