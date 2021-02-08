package com.suleymancelik.github.common.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.MavericksView

abstract class BaseFragment(@LayoutRes containerLayoutId: Int = 0) : Fragment(containerLayoutId), MavericksView