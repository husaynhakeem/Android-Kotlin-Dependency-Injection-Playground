package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R
import javax.inject.Inject

/**
 * Created by husaynhakeem on 2/24/18.
 */

class FirstActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: FirstPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        with(FirstFragment.newInstance()) {
            setUpScreen(this)
            setUpDependencies(this)
        }
        checkNotNull(presenter)
    }

    private fun setUpScreen(fragment: FirstFragment) {
        supportFragmentManager.beginTransaction()
                .add(R.id.firstScreenContainer, fragment)
                .commit()
    }

    private fun setUpDependencies(view: FirstContract.View) {
        DaggerFirstComponent.builder()
                .firstModule(FirstModule(view))
                .build()
                .inject(this)
    }
}