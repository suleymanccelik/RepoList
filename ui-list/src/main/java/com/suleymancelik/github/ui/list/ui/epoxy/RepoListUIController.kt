package com.suleymancelik.github.ui.list.ui.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import com.suleymancelik.github.data.repo.RepoListModelItem

class RepoListUIController(private val callbacks: AdapterCallbacks) :
    TypedEpoxyController<List<RepoListModelItem>>() {

    interface AdapterCallbacks {
        fun listener(repository: RepoListModelItem)
    }

    override fun buildModels(data: List<RepoListModelItem>) {
        data.forEach { repo ->
            repoListItem {
                id(repo.id)
                repo(repo)
                listener {
                    callbacks.listener(repo)
                }
            }
        }
    }
}
