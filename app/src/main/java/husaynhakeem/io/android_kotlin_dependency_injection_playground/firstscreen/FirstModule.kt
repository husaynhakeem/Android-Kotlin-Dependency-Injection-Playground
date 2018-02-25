package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import dagger.Module
import dagger.Provides
import husaynhakeem.io.android_kotlin_dependency_injection_playground.injection.FeatureScoped
import javax.inject.Named

/**
 * Created by husaynhakeem on 2/24/18.
 */

@Module
class FirstModule(private val view: FirstContract.View) {

    @FeatureScoped
    @Provides
    @Named("magic")
    fun providesMessage(): String = "Show me some magic!"

    @FeatureScoped
    @Provides
    @Named("anything")
    fun providesAnotherMessage(): String = "Show me anything.."

    @FeatureScoped
    @Provides
    fun providesFirstView(): FirstContract.View = view
}