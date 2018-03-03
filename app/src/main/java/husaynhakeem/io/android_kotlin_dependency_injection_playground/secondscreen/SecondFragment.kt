package husaynhakeem.io.android_kotlin_dependency_injection_playground.secondscreen

import android.os.Bundle
import android.support.annotation.DrawableRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import husaynhakeem.io.android_kotlin_dependency_injection_playground.R
import kotlinx.android.synthetic.main.fragment_second.*
import org.koin.android.ext.android.inject

class SecondFragment : Fragment(), SecondContract.View {

    val presenter: SecondContract.Presenter by inject(parameters = mapOf(SECOND_VIEW to this))
    val picasso: Picasso by inject()

    private var imageResId: Int = 0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater?.inflate(R.layout.fragment_second, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.start()
    }

    override fun displayImage() {
        picasso.load(imageResId).into(secondScreenImageView)
    }

    companion object {
        fun newInstance(@DrawableRes imageResId: Int) = SecondFragment().apply {
            this.imageResId = imageResId
        }
    }
}