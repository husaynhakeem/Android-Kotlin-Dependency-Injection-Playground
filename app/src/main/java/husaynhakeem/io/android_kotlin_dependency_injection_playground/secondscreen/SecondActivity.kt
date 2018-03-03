package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R
import husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen.FirstFragment

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setUpScreen(SecondFragment.newInstance(extractImageResIdFromExtras()))
    }

    private fun setUpScreen(fragment: SecondFragment) {
        supportFragmentManager.beginTransaction()
                .add(R.id.secondScreenContainer, fragment)
                .commit()
    }

    private fun extractImageResIdFromExtras(): Int {
        try {
            return intent.extras.getInt(FirstFragment.EXTRA_IMAGE_RES_ID)
        } catch (e: NullPointerException) {
            throw RuntimeException("SecondActivity.extractImageResIdFromExtras(): The image resource id must be passed")
        }
    }
}