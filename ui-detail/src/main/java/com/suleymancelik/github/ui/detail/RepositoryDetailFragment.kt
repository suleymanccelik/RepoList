package com.suleymancelik.github.ui.detail

import android.content.Context
import android.os.Bundle
import android.view.View
import com.airbnb.mvrx.BaseMvRxFragment
import com.suleymancelik.github.common.ui.viewBinding
import com.suleymancelik.github.ui.detail.databinding.FragmentRepoDetailBinding

class RepositoryDetailFragment : BaseMvRxFragment(R.layout.fragment_repo_detail) {

    private val mRepoDetailViewBinding by viewBinding(FragmentRepoDetailBinding::bind)
    private var mInflaterContext: Context? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mInflaterContext = view.context
        prepareDetailPage()
    }

    private fun prepareDetailPage() {

    }

    override fun invalidate() {

    }

}