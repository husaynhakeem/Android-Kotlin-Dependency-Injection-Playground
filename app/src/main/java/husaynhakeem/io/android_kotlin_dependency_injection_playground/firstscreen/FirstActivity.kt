package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R


class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        setUpScreen(FirstFragment.newInstance())
    }

    private fun setUpScreen(fragment: FirstFragment) {
        supportFragmentManager.beginTransaction()
                .add(R.id.firstScreenContainer, fragment)
                .commit()
    }
}