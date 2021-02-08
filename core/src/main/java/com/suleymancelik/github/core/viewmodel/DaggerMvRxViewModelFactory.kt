package com.suleymancelik.github.core.viewmodel

import com.airbnb.mvrx.*
import com.suleymancelik.github.core.MvRxViewModel

/**
 * A [MvRxViewModelFactory] which makes it easy to create instances of a ViewModel
 * using its AssistedInject Factory. This class should be implemented by the companion object
 * of every ViewModel which uses AssistedInject.
 *
 * @param viewModelClass The [Class] of the ViewModel being requested for creation
 *
 * This class accesses the map of [AssistedViewModelFactory]s from [AppComponent] and uses it to
 * retrieve the requested ViewModel's factory class. It then creates an instance of this ViewModel
 * using the retrieved factory and returns it.
 *
 * Example:
 *
 * class MyViewModel @AssistedInject constructor(...): BaseViewModel<MyState>(...) {
 *
 *   @AssistedInject.Factory
 *   interface Factory : AssistedViewModelFactory<MyViewModel, MyState> {
 *     ...
 *   }
 *
 *   companion object : DaggerMvRxViewModelFactory<MyViewModel, MyState>(MyViewModel::class.java)
 *
 * }
 */
abstract class DaggerMvRxViewModelFactory<VM : MvRxViewModel<S>, S : MavericksState>(
    private val viewModelClass: Class<out MvRxViewModel<S>>
) : MavericksViewModelFactory<VM, S> {

    override fun create(viewModelContext: ViewModelContext, state: S): VM? {
        return createViewModel(state)
    }

    private fun <VM : MvRxViewModel<S>, S : MavericksState> createViewModel(state: S): VM {
        val viewModelFactoryMap =
            ViewModelFactoryComponent.getInstance().provideViewModelFactories()
        val viewModelFactory = viewModelFactoryMap[viewModelClass]

        @Suppress("UNCHECKED_CAST")
        val castedViewModelFactory = viewModelFactory as? AssistedViewModelFactory<VM, S>
        val viewModel = castedViewModelFactory?.create(state)
        return viewModel as VM
    }
}

