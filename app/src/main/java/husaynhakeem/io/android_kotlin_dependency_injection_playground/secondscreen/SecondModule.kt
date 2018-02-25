package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import dagger.Module
import dagger.Provides
import husaynhakeem.io.android_kotlin_dependency_injection_playground.injection.FeatureScoped

/**
 * Created by husaynhakeem on 2/24/18.
 */

@Module
class SecondModule(private val view: SecondContract.View) {

    @FeatureScoped
    @Provides
    fun providesView() = view
}