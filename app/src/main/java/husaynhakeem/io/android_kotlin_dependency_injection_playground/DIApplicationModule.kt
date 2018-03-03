package husaynhakeem.io.android_kotlin_dependency_injection_playground

import android.content.Context
import android.util.Log
import com.squareup.picasso.Picasso
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

val applicationModule: Module = applicationContext {
    bean { getPicassoInstance(androidApplication()) }
}

private fun getPicassoInstance(context: Context): Picasso = Picasso.Builder(context)
        .listener { _, uri, _ -> Log.e("Picasso", "Failed to load image $uri") }
        .build()