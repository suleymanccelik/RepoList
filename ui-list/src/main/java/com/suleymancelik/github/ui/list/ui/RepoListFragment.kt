package com.suleymancelik.github.ui.list.ui

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.os.bundleOf
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.airbnb.mvrx.*
import com.suleymancelik.github.common.ui.viewBinding
import com.suleymancelik.github.core.helper.NetworkHelper
import com.suleymancelik.github.data.common.EmptyListException
import com.suleymancelik.github.data.common.NetworkErrorException
import com.suleymancelik.github.data.repo.RepoListModelItem
import com.suleymancelik.github.ui.list.R
import com.suleymancelik.github.ui.list.databinding.FragmentRepoListBinding
import com.suleymancelik.github.ui.list.ui.epoxy.RepoListUIController
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class RepoListFragment : BaseMvRxFragment(R.layout.fragment_repo_list),
    RepoListUIController.AdapterCallbacks {

    private val mRepoListViewModel: RepoListViewModel by fragmentViewModel()
    private val mRepoListViewBinding by viewBinding(FragmentRepoListBinding::bind)

    private lateinit var mRepoList: List<RepoListModelItem>
    private lateinit var mRepoListController: RepoListUIController
    private var mInflaterContext: Context? = null
    private lateinit var mSearchHandler: Handler
    private lateinit var mSearchRunner: Runnable
    private var mSearchQuery: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mInflaterContext = view.context
        prepareInitialPage()
    }

    override fun invalidate(): Unit = withState(mRepoListViewModel) { state: RepoListState ->
        when (state.repoListState) {
            is Uninitialized -> showEmptyResultScreen()
            is Loading -> showLoadingScreen()
            is Success -> showSearchResult(state.repoList)
            is Fail -> handleError(state.repoListState.error)
        }
    }

    override fun listener(repository: RepoListModelItem) {
        val bundle = bundleOf(
            "starCount" to repository.stargazersCount,
            "issueCount" to repository.openIssuesCount,
            "imageUrl" to repository.owner.avatarUrl,
            "ownerName" to repository.owner.login,
            "title" to repository.name
        )
        findNavController().navigate(
            R.id.repoDetailFragment,
            bundle
        )
    }

    private fun handleError(errorType: Throwable) {
        when (errorType) {
            is EmptyListException -> {
                showEmptyResultScreen()
            }
            is NetworkErrorException -> {
                showNoNetworkContent()
            }
            else -> {
                showErrorContent()
            }
        }
    }

    private fun showLoadingScreen() {
        mRepoListViewBinding.rclRepoList.visibility = View.GONE
        mRepoListViewBinding.noConnectionView.root.visibility = View.GONE
        mRepoListViewBinding.systemErrorView.root.visibility = View.GONE
        mRepoListViewBinding.progressBar.visibility = View.VISIBLE
    }

    private fun showEmptyResultScreen() {
        mRepoListViewBinding.rclRepoList.visibility = View.GONE
        mRepoListViewBinding.progressBar.visibility = View.GONE
        mRepoListViewBinding.noConnectionView.root.visibility = View.GONE
        mRepoListViewBinding.systemErrorView.root.visibility = View.GONE
    }

    private fun showListContent() {
        mRepoListViewBinding.progressBar.visibility = View.GONE
        mRepoListViewBinding.noConnectionView.root.visibility = View.GONE
        mRepoListViewBinding.systemErrorView.root.visibility = View.GONE
        mRepoListViewBinding.rclRepoList.visibility = View.VISIBLE
    }

    private fun showErrorContent() {
        mRepoListViewBinding.progressBar.visibility = View.GONE
        mRepoListViewBinding.rclRepoList.visibility = View.GONE
        mRepoListViewBinding.noConnectionView.root.visibility = View.GONE
        mRepoListViewBinding.systemErrorView.root.visibility = View.VISIBLE
        mRepoListViewBinding.noConnectionView.btnNoConnection.setOnClickListener {
            if (!mSearchQuery.isNullOrEmpty()) {
                mSearchQuery?.let {
                    mRepoListViewModel.makeSearchOperation(it)
                }
            } else {
                showListContent()
            }
        }
    }

    private fun showNoNetworkContent() {
        mRepoListViewBinding.progressBar.visibility = View.GONE
        mRepoListViewBinding.rclRepoList.visibility = View.GONE
        mRepoListViewBinding.systemErrorView.root.visibility = View.GONE
        mRepoListViewBinding.noConnectionView.root.visibility = View.VISIBLE
    }

    private fun showSearchResult(repoList: List<RepoListModelItem>) {
        if (!repoList.isNullOrEmpty()) {
            showListContent()
            mRepoListController = RepoListUIController(this)
            mRepoListViewBinding.rclRepoList.setController(mRepoListController)
            mRepoList = repoList
            mRepoListController.setData(repoList)
        } else {
            showEmptyResultScreen()
        }
    }

    private fun prepareInitialPage() {
        mRepoListViewBinding.searchView.searchText.doAfterTextChanged {
            //prepareSearchOperation(it.toString())
            closeIconStatus(it.toString())
        }
        mRepoListViewBinding.searchView.btnSubmit.setOnClickListener {
            mSearchQuery = mRepoListViewBinding.searchView.searchText.text.toString()
            if (!mSearchQuery.isNullOrEmpty()) {
                mSearchQuery?.let {
                    mRepoListViewModel.makeSearchOperation(it)
                }
            }
        }

        mRepoListViewBinding.searchView.iconClose.setOnClickListener {
            mRepoListViewBinding.searchView.searchText.clearFocus()
            mRepoListViewBinding.searchView.searchText.text?.clear()
        }
    }

    private fun closeIconStatus(query: String) {
        if (query.isEmpty()) {
            mRepoListViewBinding.searchView.iconClose.visibility = View.GONE
        } else {
            mRepoListViewBinding.searchView.iconClose.visibility = View.VISIBLE
        }
    }

    private fun prepareSearchOperation(query: String) {
        if (::mSearchHandler.isInitialized) {
            mSearchHandler.removeCallbacks(mSearchRunner)
        }
        if (query.isEmpty()) {
            mRepoListViewBinding.searchView.iconClose.visibility = View.GONE
        } else {
            mRepoListViewBinding.searchView.iconClose.visibility = View.VISIBLE
            if (query.length >= 3) {
                mSearchHandler = Handler(Looper.getMainLooper())
                mSearchRunner = Runnable {
                    if (query != mSearchQuery) {
                        mSearchQuery = query
                        mRepoListViewModel.makeSearchOperation(query)
                    }
                }
                mSearchHandler.postDelayed(mSearchRunner, 750)
            }
        }
    }
}