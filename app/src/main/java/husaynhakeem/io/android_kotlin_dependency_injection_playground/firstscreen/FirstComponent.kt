package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import dagger.Component
import husaynhakeem.io.android_kotlin_dependency_injection_playground.injection.FeatureScoped

/**
 * Created by husaynhakeem on 2/24/18.
 */

@FeatureScoped
@Component(modules = [FirstModule::class])
interface FirstComponent {

    fun inject(activity: FirstActivity)
}