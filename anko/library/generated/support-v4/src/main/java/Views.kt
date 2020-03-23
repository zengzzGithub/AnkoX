@file:JvmName("SupportV4ViewsKt")
package org.jetbrains.anko.support.v4

import org.jetbrains.anko.custom.*
import org.jetbrains.anko.AnkoViewDslMarker
import android.view.ViewManager
import android.view.ViewGroup.LayoutParams
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.Build
import android.widget.*
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTabHost
import androidx.legacy.widget.Space
import androidx.slidingpanelayout.widget.SlidingPaneLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.viewpager.widget.PagerTabStrip
import androidx.viewpager.widget.PagerTitleStrip
import androidx.viewpager.widget.ViewPager

@PublishedApi
internal object `$$Anko$Factories$SupportV4View` {
    val PAGER_TAB_STRIP = { ctx: Context -> PagerTabStrip(ctx) }
    val PAGER_TITLE_STRIP = { ctx: Context -> PagerTitleStrip(ctx) }
    val CONTENT_LOADING_PROGRESS_BAR = { ctx: Context -> androidx.core.widget.ContentLoadingProgressBar(ctx) }
    val SPACE = { ctx: Context -> androidx.legacy.widget.Space(ctx) }
    val SWIPE_REFRESH_LAYOUT = { ctx: Context -> SwipeRefreshLayout(ctx) }
}

inline fun ViewManager.pagerTabStrip(): PagerTabStrip = pagerTabStrip() {}
inline fun ViewManager.pagerTabStrip(init: (@AnkoViewDslMarker PagerTabStrip).() -> Unit): PagerTabStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme = 0) { init() }
}

inline fun ViewManager.themedPagerTabStrip(theme: Int = 0): PagerTabStrip = themedPagerTabStrip(theme) {}
inline fun ViewManager.themedPagerTabStrip(theme: Int = 0, init: (@AnkoViewDslMarker PagerTabStrip).() -> Unit): PagerTabStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme) { init() }
}

inline fun Context.pagerTabStrip(): PagerTabStrip = pagerTabStrip() {}
inline fun Context.pagerTabStrip(init: (@AnkoViewDslMarker PagerTabStrip).() -> Unit): PagerTabStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme = 0) { init() }
}

inline fun Context.themedPagerTabStrip(theme: Int = 0): PagerTabStrip = themedPagerTabStrip(theme) {}
inline fun Context.themedPagerTabStrip(theme: Int = 0, init: (@AnkoViewDslMarker PagerTabStrip).() -> Unit): PagerTabStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme) { init() }
}

inline fun Activity.pagerTabStrip(): PagerTabStrip = pagerTabStrip() {}
inline fun Activity.pagerTabStrip(init: (@AnkoViewDslMarker PagerTabStrip).() -> Unit): PagerTabStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme = 0) { init() }
}

inline fun Activity.themedPagerTabStrip(theme: Int = 0): PagerTabStrip = themedPagerTabStrip(theme) {}
inline fun Activity.themedPagerTabStrip(theme: Int = 0, init: (@AnkoViewDslMarker PagerTabStrip).() -> Unit): PagerTabStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme) { init() }
}

inline fun ViewManager.pagerTitleStrip(): PagerTitleStrip = pagerTitleStrip() {}
inline fun ViewManager.pagerTitleStrip(init: (@AnkoViewDslMarker PagerTitleStrip).() -> Unit): PagerTitleStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme = 0) { init() }
}

inline fun ViewManager.themedPagerTitleStrip(theme: Int = 0): PagerTitleStrip = themedPagerTitleStrip(theme) {}
inline fun ViewManager.themedPagerTitleStrip(theme: Int = 0, init: (@AnkoViewDslMarker PagerTitleStrip).() -> Unit): PagerTitleStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme) { init() }
}

inline fun Context.pagerTitleStrip(): PagerTitleStrip = pagerTitleStrip() {}
inline fun Context.pagerTitleStrip(init: (@AnkoViewDslMarker PagerTitleStrip).() -> Unit): PagerTitleStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme = 0) { init() }
}

inline fun Context.themedPagerTitleStrip(theme: Int = 0): PagerTitleStrip = themedPagerTitleStrip(theme) {}
inline fun Context.themedPagerTitleStrip(theme: Int = 0, init: (@AnkoViewDslMarker PagerTitleStrip).() -> Unit): PagerTitleStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme) { init() }
}

inline fun Activity.pagerTitleStrip(): PagerTitleStrip = pagerTitleStrip() {}
inline fun Activity.pagerTitleStrip(init: (@AnkoViewDslMarker PagerTitleStrip).() -> Unit): PagerTitleStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme = 0) { init() }
}

inline fun Activity.themedPagerTitleStrip(theme: Int = 0): PagerTitleStrip = themedPagerTitleStrip(theme) {}
inline fun Activity.themedPagerTitleStrip(theme: Int = 0, init: (@AnkoViewDslMarker PagerTitleStrip).() -> Unit): PagerTitleStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme) { init() }
}

inline fun ViewManager.contentLoadingProgressBar(): androidx.core.widget.ContentLoadingProgressBar = contentLoadingProgressBar() {}
inline fun ViewManager.contentLoadingProgressBar(init: (@AnkoViewDslMarker androidx.core.widget.ContentLoadingProgressBar).() -> Unit): androidx.core.widget.ContentLoadingProgressBar {
    return ankoView(`$$Anko$Factories$SupportV4View`.CONTENT_LOADING_PROGRESS_BAR, theme = 0) { init() }
}

inline fun ViewManager.themedContentLoadingProgressBar(theme: Int = 0): androidx.core.widget.ContentLoadingProgressBar = themedContentLoadingProgressBar(theme) {}
inline fun ViewManager.themedContentLoadingProgressBar(theme: Int = 0, init: (@AnkoViewDslMarker androidx.core.widget.ContentLoadingProgressBar).() -> Unit): androidx.core.widget.ContentLoadingProgressBar {
return ankoView(`$$Anko$Factories$SupportV4View`.CONTENT_LOADING_PROGRESS_BAR, theme) { init() }
}

inline fun ViewManager.space(): Space = space() {}
inline fun ViewManager.space(init: (@AnkoViewDslMarker Space).() -> Unit): Space {
    return ankoView(`$$Anko$Factories$SupportV4View`.SPACE, theme = 0) { init() }
}

inline fun ViewManager.themedSpace(theme: Int = 0): Space = themedSpace(theme) {}
inline fun ViewManager.themedSpace(theme: Int = 0, init: (@AnkoViewDslMarker Space).() -> Unit): Space {
return ankoView(`$$Anko$Factories$SupportV4View`.SPACE, theme) { init() }
}

inline fun ViewManager.swipeRefreshLayout(): SwipeRefreshLayout = swipeRefreshLayout() {}
inline fun ViewManager.swipeRefreshLayout(init: (@AnkoViewDslMarker SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout {
    return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedSwipeRefreshLayout(theme: Int = 0): SwipeRefreshLayout = themedSwipeRefreshLayout(theme) {}
inline fun ViewManager.themedSwipeRefreshLayout(theme: Int = 0, init: (@AnkoViewDslMarker SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout {
return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme) { init() }
}

inline fun Context.swipeRefreshLayout(): SwipeRefreshLayout = swipeRefreshLayout() {}
inline fun Context.swipeRefreshLayout(init: (@AnkoViewDslMarker SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout {
    return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedSwipeRefreshLayout(theme: Int = 0): SwipeRefreshLayout = themedSwipeRefreshLayout(theme) {}
inline fun Context.themedSwipeRefreshLayout(theme: Int = 0, init: (@AnkoViewDslMarker SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout {
return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme) { init() }
}

inline fun Activity.swipeRefreshLayout(): SwipeRefreshLayout = swipeRefreshLayout() {}
inline fun Activity.swipeRefreshLayout(init: (@AnkoViewDslMarker SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout {
    return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedSwipeRefreshLayout(theme: Int = 0): SwipeRefreshLayout = themedSwipeRefreshLayout(theme) {}
inline fun Activity.themedSwipeRefreshLayout(theme: Int = 0, init: (@AnkoViewDslMarker SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout {
return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme) { init() }
}

@PublishedApi
internal object `$$Anko$Factories$SupportV4ViewGroup` {
    val FRAGMENT_TAB_HOST = { ctx: Context -> _FragmentTabHost(ctx) }
    val VIEW_PAGER = { ctx: Context -> _ViewPager(ctx) }
    val DRAWER_LAYOUT = { ctx: Context -> _DrawerLayout(ctx) }
    val NESTED_SCROLL_VIEW = { ctx: Context -> _NestedScrollView(ctx) }
    val SLIDING_PANE_LAYOUT = { ctx: Context -> _SlidingPaneLayout(ctx) }
}

inline fun ViewManager.fragmentTabHost(): FragmentTabHost = fragmentTabHost() {}
inline fun ViewManager.fragmentTabHost(init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): FragmentTabHost {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme = 0) { init() }
}

inline fun ViewManager.themedFragmentTabHost(theme: Int = 0): FragmentTabHost = themedFragmentTabHost(theme) {}
inline fun ViewManager.themedFragmentTabHost(theme: Int = 0, init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): FragmentTabHost {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme) { init() }
}

inline fun Context.fragmentTabHost(): FragmentTabHost = fragmentTabHost() {}
inline fun Context.fragmentTabHost(init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): FragmentTabHost {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme = 0) { init() }
}

inline fun Context.themedFragmentTabHost(theme: Int = 0): FragmentTabHost = themedFragmentTabHost(theme) {}
inline fun Context.themedFragmentTabHost(theme: Int = 0, init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): FragmentTabHost {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme) { init() }
}

inline fun Activity.fragmentTabHost(): FragmentTabHost = fragmentTabHost() {}
inline fun Activity.fragmentTabHost(init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): FragmentTabHost {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme = 0) { init() }
}

inline fun Activity.themedFragmentTabHost(theme: Int = 0): FragmentTabHost = themedFragmentTabHost(theme) {}
inline fun Activity.themedFragmentTabHost(theme: Int = 0, init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): FragmentTabHost {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme) { init() }
}

inline fun ViewManager.viewPager(): ViewPager = viewPager() {}
inline fun ViewManager.viewPager(init: (@AnkoViewDslMarker _ViewPager).() -> Unit): ViewPager {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme = 0) { init() }
}

inline fun ViewManager.themedViewPager(theme: Int = 0): ViewPager = themedViewPager(theme) {}
inline fun ViewManager.themedViewPager(theme: Int = 0, init: (@AnkoViewDslMarker _ViewPager).() -> Unit): ViewPager {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme) { init() }
}

inline fun Context.viewPager(): ViewPager = viewPager() {}
inline fun Context.viewPager(init: (@AnkoViewDslMarker _ViewPager).() -> Unit): ViewPager {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme = 0) { init() }
}

inline fun Context.themedViewPager(theme: Int = 0): ViewPager = themedViewPager(theme) {}
inline fun Context.themedViewPager(theme: Int = 0, init: (@AnkoViewDslMarker _ViewPager).() -> Unit): ViewPager {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme) { init() }
}

inline fun Activity.viewPager(): ViewPager = viewPager() {}
inline fun Activity.viewPager(init: (@AnkoViewDslMarker _ViewPager).() -> Unit): ViewPager {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme = 0) { init() }
}

inline fun Activity.themedViewPager(theme: Int = 0): ViewPager = themedViewPager(theme) {}
inline fun Activity.themedViewPager(theme: Int = 0, init: (@AnkoViewDslMarker _ViewPager).() -> Unit): ViewPager {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme) { init() }
}

inline fun ViewManager.drawerLayout(): DrawerLayout = drawerLayout() {}
inline fun ViewManager.drawerLayout(init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): DrawerLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedDrawerLayout(theme: Int = 0): DrawerLayout = themedDrawerLayout(theme) {}
inline fun ViewManager.themedDrawerLayout(theme: Int = 0, init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): DrawerLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme) { init() }
}

inline fun Context.drawerLayout(): DrawerLayout = drawerLayout() {}
inline fun Context.drawerLayout(init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): DrawerLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedDrawerLayout(theme: Int = 0): DrawerLayout = themedDrawerLayout(theme) {}
inline fun Context.themedDrawerLayout(theme: Int = 0, init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): DrawerLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme) { init() }
}

inline fun Activity.drawerLayout(): DrawerLayout = drawerLayout() {}
inline fun Activity.drawerLayout(init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): DrawerLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedDrawerLayout(theme: Int = 0): DrawerLayout = themedDrawerLayout(theme) {}
inline fun Activity.themedDrawerLayout(theme: Int = 0, init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): DrawerLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme) { init() }
}

inline fun ViewManager.nestedScrollView(): androidx.core.widget.NestedScrollView = nestedScrollView() {}
inline fun ViewManager.nestedScrollView(init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedNestedScrollView(theme: Int = 0): androidx.core.widget.NestedScrollView = themedNestedScrollView(theme) {}
inline fun ViewManager.themedNestedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme) { init() }
}

inline fun Context.nestedScrollView(): androidx.core.widget.NestedScrollView = nestedScrollView() {}
inline fun Context.nestedScrollView(init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme = 0) { init() }
}

inline fun Context.themedNestedScrollView(theme: Int = 0): androidx.core.widget.NestedScrollView = themedNestedScrollView(theme) {}
inline fun Context.themedNestedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme) { init() }
}

inline fun Activity.nestedScrollView(): androidx.core.widget.NestedScrollView = nestedScrollView() {}
inline fun Activity.nestedScrollView(init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme = 0) { init() }
}

inline fun Activity.themedNestedScrollView(theme: Int = 0): androidx.core.widget.NestedScrollView = themedNestedScrollView(theme) {}
inline fun Activity.themedNestedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme) { init() }
}

inline fun ViewManager.slidingPaneLayout(): SlidingPaneLayout = slidingPaneLayout() {}
inline fun ViewManager.slidingPaneLayout(init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): SlidingPaneLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedSlidingPaneLayout(theme: Int = 0): SlidingPaneLayout = themedSlidingPaneLayout(theme) {}
inline fun ViewManager.themedSlidingPaneLayout(theme: Int = 0, init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): SlidingPaneLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme) { init() }
}

inline fun Context.slidingPaneLayout(): SlidingPaneLayout = slidingPaneLayout() {}
inline fun Context.slidingPaneLayout(init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): SlidingPaneLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedSlidingPaneLayout(theme: Int = 0): SlidingPaneLayout = themedSlidingPaneLayout(theme) {}
inline fun Context.themedSlidingPaneLayout(theme: Int = 0, init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): SlidingPaneLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme) { init() }
}

inline fun Activity.slidingPaneLayout(): SlidingPaneLayout = slidingPaneLayout() {}
inline fun Activity.slidingPaneLayout(init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): SlidingPaneLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedSlidingPaneLayout(theme: Int = 0): SlidingPaneLayout = themedSlidingPaneLayout(theme) {}
inline fun Activity.themedSlidingPaneLayout(theme: Int = 0, init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): SlidingPaneLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme) { init() }
}

