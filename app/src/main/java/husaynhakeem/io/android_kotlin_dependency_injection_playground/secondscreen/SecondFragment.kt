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
import javax.inject.Inject

/**
 * Created by husaynhakeem on 2/24/18.
 */

class SecondFragment : Fragment(), SecondContract.View {

    private lateinit var presenter: SecondContract.Presenter
    private var imageResId: Int = 0

    @Inject
    lateinit var picasso: Picasso

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater?.inflate(R.layout.fragment_second, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpDependencies()
        presenter.start()
    }

    private fun setUpDependencies() {
        (activity as SecondActivity).component.inject(this)
    }

    override fun displayImage() {
        picasso.load(imageResId).into(secondScreenImageView)
    }

    override fun setPresenter(presenter: SecondContract.Presenter) {
        this.presenter = presenter
    }

    companion object {
        fun newInstance(@DrawableRes imageResId: Int) = SecondFragment().apply {
            this.imageResId = imageResId
        }
    }
}