package com.suleymancelik.github.ui.list.ui.epoxy

import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.suleymancelik.github.common.ui.ViewBindingEpoxyModelWithHolder
import com.suleymancelik.github.data.repo.RepoListModelItem
import com.suleymancelik.github.ui.list.R
import com.suleymancelik.github.ui.list.databinding.ItemRepoListBinding

@EpoxyModelClass
abstract class RepoListItemModel : ViewBindingEpoxyModelWithHolder<ItemRepoListBinding>() {

    @EpoxyAttribute
    lateinit var repo: RepoListModelItem

    @EpoxyAttribute
    lateinit var listener: (repo: RepoListModelItem) -> Unit

    override fun getDefaultLayout(): Int = R.layout.item_repo_list

    override fun ItemRepoListBinding.bind() {
        txtRepoName.text = repo.name
        txtRepoStarCount.text = repo.stargazersCount.toString()
        cardView.setOnClickListener { listener(repo) }
    }
}