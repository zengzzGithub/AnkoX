@file:JvmName("DesignListenersListenersKt")
package org.jetbrains.anko.design.listeners

import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout


inline fun AppBarLayout.onOffsetChanged(noinline l: (appBarLayout: AppBarLayout?, verticalOffset: Int) -> Unit) {
    addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, i ->
            l(appBarLayout, i)
    })
}

fun TabLayout.onTabSelectedListener(init: __TabLayout_OnTabSelectedListener.() -> Unit) {
    val listener = __TabLayout_OnTabSelectedListener()
    listener.init()
    addOnTabSelectedListener(listener)
}

class __TabLayout_OnTabSelectedListener : TabLayout.OnTabSelectedListener {

    private var _onTabSelected: ((TabLayout.Tab?) -> Unit)? = null

    override fun onTabSelected(tab: TabLayout.Tab?) {
        _onTabSelected?.invoke(tab)
    }

    fun onTabSelected(listener: (TabLayout.Tab?) -> Unit) {
        _onTabSelected = listener
    }

    private var _onTabUnselected: ((TabLayout.Tab?) -> Unit)? = null

    override fun onTabUnselected(tab: TabLayout.Tab?) {
        _onTabUnselected?.invoke(tab)
    }

    fun onTabUnselected(listener: (TabLayout.Tab?) -> Unit) {
        _onTabUnselected = listener
    }

    private var _onTabReselected: ((TabLayout.Tab?) -> Unit)? = null

    override fun onTabReselected(tab: TabLayout.Tab?) {
        _onTabReselected?.invoke(tab)
    }

    fun onTabReselected(listener: (TabLayout.Tab?) -> Unit) {
        _onTabReselected = listener
    }

}

inline fun BottomNavigationView.onNavigationItemSelected(noinline l: (item: android.view.MenuItem?) -> Boolean) {
    setOnNavigationItemSelectedListener(l)
}

fun CoordinatorLayout.onHierarchyChangeListener(init: __ViewGroup_OnHierarchyChangeListener.() -> Unit) {
    val listener = __ViewGroup_OnHierarchyChangeListener()
    listener.init()
    setOnHierarchyChangeListener(listener)
}

class __ViewGroup_OnHierarchyChangeListener : android.view.ViewGroup.OnHierarchyChangeListener {

    private var _onChildViewAdded: ((android.view.View?, android.view.View?) -> Unit)? = null

    override fun onChildViewAdded(parent: android.view.View?, child: android.view.View?) {
        _onChildViewAdded?.invoke(parent, child)
    }

    fun onChildViewAdded(listener: (android.view.View?, android.view.View?) -> Unit) {
        _onChildViewAdded = listener
    }

    private var _onChildViewRemoved: ((android.view.View?, android.view.View?) -> Unit)? = null

    override fun onChildViewRemoved(parent: android.view.View?, child: android.view.View?) {
        _onChildViewRemoved?.invoke(parent, child)
    }

    fun onChildViewRemoved(listener: (android.view.View?, android.view.View?) -> Unit) {
        _onChildViewRemoved = listener
    }

}

