@file:Suppress("DEPRECATION")

package com.suleymancelik.github.ui.list.ui.epoxy

import com.airbnb.epoxy.ModelCollector
import kotlin.Suppress
import kotlin.Unit

inline fun ModelCollector.repoListItem(modelInitializer: RepoListItemModelBuilder.() -> Unit) {
  add(
  RepoListItemModel_().apply {
    modelInitializer()
  }
  )
}
