package husaynhakeem.io.android_kotlin_dependency_injection_playground

import android.app.Application
import android.util.Log
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by husaynhakeem on 2/24/18.
 */

@Module
class DIApplicationModule(private val application: Application) {

    @Singleton
    @Provides
    fun providesPicasso() = Picasso.Builder(application)
            .listener { _, uri, _ -> Log.e("Picasso", "Failed to load image $uri") }
            .build()
}