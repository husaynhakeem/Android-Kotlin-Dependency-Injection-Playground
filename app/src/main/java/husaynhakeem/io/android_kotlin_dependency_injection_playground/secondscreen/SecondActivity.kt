package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import husaynhakeem.io.android_kotlin_dependency_injection_playground.DIApplication
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R
import husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen.FirstFragment
import javax.inject.Inject

/**
 * Created by husaynhakeem on 2/24/18.
 */

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: SecondPresenter

    lateinit var component: SecondComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        with(SecondFragment.newInstance(extractImageResIdFromExtras())) {
            setUpScreen(this)
            setUpDependencies(this)
        }
        checkNotNull(presenter)
    }

    private fun extractImageResIdFromExtras(): Int {
        try {
            return intent.extras.getInt(FirstFragment.EXTRA_IMAGE_RES_ID)
        } catch (e: NullPointerException) {
            throw RuntimeException("SecondActivity.extractImageResIdFromExtras(): The image resource id must be passed")
        }
    }

    private fun setUpScreen(fragment: SecondFragment) {
        supportFragmentManager.beginTransaction()
                .add(R.id.secondScreenContainer, fragment)
                .commit()
    }

    private fun setUpDependencies(view: SecondContract.View) {
        component = DaggerSecondComponent.builder()
                .dIApplicationComponent((application as DIApplication).component)
                .secondModule(SecondModule(view))
                .build()
        component.inject(this)
    }
}