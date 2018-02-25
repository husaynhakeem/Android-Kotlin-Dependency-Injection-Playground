package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import dagger.Component
import husaynhakeem.io.android_kotlin_dependency_injection_playground.DIApplicationComponent
import husaynhakeem.io.android_kotlin_dependency_injection_playground.injection.FeatureScoped

/**
 * Created by husaynhakeem on 2/24/18.
 */

@FeatureScoped
@Component(dependencies = [DIApplicationComponent::class], modules = [SecondModule::class])
interface SecondComponent {

    fun inject(activity: SecondActivity)

    fun inject(fragment: SecondFragment)
}