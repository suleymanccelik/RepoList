package com.suleymancelik.github.ui.detail

import android.content.Context
import android.os.Bundle
import android.view.View
import coil.load
import com.airbnb.mvrx.MavericksView
import com.suleymancelik.github.common.ui.BaseFragment
import com.suleymancelik.github.common.ui.viewBinding
import com.suleymancelik.github.ui.detail.databinding.FragmentRepoDetailBinding

class RepositoryDetailFragment : BaseFragment(R.layout.fragment_repo_detail) {

    private val mRepoDetailViewBinding by viewBinding(FragmentRepoDetailBinding::bind)
    private var mInflaterContext: Context? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mInflaterContext = view.context
        val starCount = arguments?.getInt("starCount")
        val issueCount = arguments?.getInt("issueCount")
        val imageUrl = arguments?.getString("imageUrl")
        val ownerName = arguments?.getString("ownerName")
        prepareDetailPage(starCount, issueCount, imageUrl, ownerName)
    }

    private fun prepareDetailPage(
        starCount: Int?,
        issueCount: Int?,
        imageUrl: String?,
        ownerName: String?
    ) {
        if (!imageUrl.isNullOrEmpty()) {
            mRepoDetailViewBinding.imgOwnerLogo.load(imageUrl) {
                crossfade(enable = true)
            }
        }
        mRepoDetailViewBinding.txtOwnerName.text = ownerName
        mRepoDetailViewBinding.txtStarCount.text = getString(R.string.star_count, starCount)
        mRepoDetailViewBinding.txtIssueCount.text = getString(R.string.issue_count, issueCount)
    }


    override fun invalidate() {

    }

}