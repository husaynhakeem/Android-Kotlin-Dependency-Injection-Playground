package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import android.content.ComponentName
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.intent.rule.IntentsTestRule
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertContains
import com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R
import husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen.SecondActivity
import junit.framework.AssertionFailedError
import org.hamcrest.Matchers.anyOf
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by husaynhakeem on 2/24/18.
 */

class FirstFragmentShould {

    private val ONE_SECOND_IN_MILLIS = 1000L
    private val message = "Show me some magic!"
    private val anotherMessage = "Show me anything.."
    private val activityTestRule = IntentsTestRule<FirstActivity>(FirstActivity::class.java)

    @Before
    fun setUp() {
        activityTestRule.launchActivity(null)
    }

    @Test
    fun displayEmptyMessage_whenActivityIsFirstLaunched() {
        assertContains(R.id.firstScreenMessageTextView, "")
    }

    @Test
    fun displayNoneEmptyMessage_afterActivityIsLaunched() {
        Thread.sleep(ONE_SECOND_IN_MILLIS)

        try {
            assertContains(R.id.firstScreenMessageTextView, message)
        } catch (e: AssertionFailedError) {
            assertContains(R.id.firstScreenMessageTextView, anotherMessage)
        }
    }

    @Test
    fun showSecondScreenWithMagicImage_whenMagicMessageIsClicked() {
        Thread.sleep(ONE_SECOND_IN_MILLIS)

        clickOn(R.id.firstScreenMessageTextView)

        intended(hasComponent(ComponentName(
                InstrumentationRegistry.getTargetContext(),
                SecondActivity::class.java.name)
        ))

        intended(anyOf(
                IntentMatchers.hasExtra(FirstFragment.EXTRA_IMAGE_RES_ID, R.drawable.magic),
                IntentMatchers.hasExtra(FirstFragment.EXTRA_IMAGE_RES_ID, R.drawable.anything)
        ))
    }

    @After
    fun tearDown() {
        activityTestRule.finishActivity()
    }
}