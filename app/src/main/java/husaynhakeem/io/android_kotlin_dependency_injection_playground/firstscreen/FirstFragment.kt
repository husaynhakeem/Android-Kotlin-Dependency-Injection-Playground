package husaynhakeem.io.android_kotlin_dependency_injection_playground.firstscreen

import android.content.Intent
import android.os.Bundle
import android.support.annotation.DrawableRes
import android.support.v4.app.Fragment
import android.view.*
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R
import husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen.SecondActivity
import kotlinx.android.synthetic.main.fragment_first.*
import org.koin.android.ext.android.inject


class FirstFragment : Fragment(), FirstContract.View {

    val presenter: FirstContract.Presenter by inject(parameters = mapOf(FIRST_VIEW to this))

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.start()
        setUpMessageClickListener()
        setHasOptionsMenu(true)
    }

    private fun setUpMessageClickListener() {
        with(firstScreenMessageTextView) {
            setOnClickListener { presenter.onMessageClicked(text.toString()) }
        }
    }

    override fun showMessage(message: String) {
        firstScreenMessageTextView.text = message
    }

    override fun showSecondScreen(messageType: MessageType) {
        when (messageType) {
            MessageType.MAGIC -> showSecondScreenWithImage(R.drawable.magic)
            MessageType.ANOTHER -> showSecondScreenWithImage(R.drawable.another)
        }
    }

    private fun showSecondScreenWithImage(@DrawableRes imageResId: Int) {
        with(Intent(context, SecondActivity::class.java)) {
            putExtra(EXTRA_IMAGE_RES_ID, imageResId)
            startActivity(this)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_first, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.firstScreenRefreshMenuItem) {
            presenter.start()
            return true
        }
        return false
    }

    companion object {
        const val EXTRA_IMAGE_RES_ID = "extra_image_res_id"
        fun newInstance() = FirstFragment()
    }
}