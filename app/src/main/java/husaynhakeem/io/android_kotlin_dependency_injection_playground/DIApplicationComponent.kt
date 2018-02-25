package husaynhakeem.io.android_kotlin_dependency_injection_playground

import com.squareup.picasso.Picasso
import dagger.Component
import javax.inject.Singleton

/**
 * Created by husaynhakeem on 2/24/18.
 */

@Singleton
@Component(modules = [DIApplicationModule::class])
interface DIApplicationComponent {

    fun exposesPicasso(): Picasso

    fun inject(application: DIApplication)
}