@file:JvmName("ConstraintLayoutViewsKt")
package org.jetbrains.anko.constraint.layout

import org.jetbrains.anko.custom.*
import org.jetbrains.anko.AnkoViewDslMarker
import android.view.ViewManager
import android.view.ViewGroup.LayoutParams
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.Build
import android.widget.*
import androidx.constraintlayout.widget.*

@PublishedApi
internal object `$$Anko$Factories$ConstraintLayoutView` {
    val BARRIER = { ctx: Context -> Barrier(ctx) }
    val GROUP = { ctx: Context -> Group(ctx) }
    val GUIDELINE = { ctx: Context -> Guideline(ctx) }
    val PLACEHOLDER = { ctx: Context -> Placeholder(ctx) }
}

inline fun ViewManager.barrier(): Barrier = barrier() {}
inline fun ViewManager.barrier(init: (@AnkoViewDslMarker Barrier).() -> Unit): Barrier {
    return ankoView(`$$Anko$Factories$ConstraintLayoutView`.BARRIER, theme = 0) { init() }
}

inline fun ViewManager.themedBarrier(theme: Int = 0): Barrier = themedBarrier(theme) {}
inline fun ViewManager.themedBarrier(theme: Int = 0, init: (@AnkoViewDslMarker Barrier).() -> Unit): Barrier {
return ankoView(`$$Anko$Factories$ConstraintLayoutView`.BARRIER, theme) { init() }
}

inline fun ViewManager.group(): Group = group() {}
inline fun ViewManager.group(init: (@AnkoViewDslMarker Group).() -> Unit): Group {
    return ankoView(`$$Anko$Factories$ConstraintLayoutView`.GROUP, theme = 0) { init() }
}

inline fun ViewManager.themedGroup(theme: Int = 0): Group = themedGroup(theme) {}
inline fun ViewManager.themedGroup(theme: Int = 0, init: (@AnkoViewDslMarker Group).() -> Unit): Group {
return ankoView(`$$Anko$Factories$ConstraintLayoutView`.GROUP, theme) { init() }
}

inline fun ViewManager.guideline(): Guideline = guideline() {}
inline fun ViewManager.guideline(init: (@AnkoViewDslMarker Guideline).() -> Unit): Guideline {
    return ankoView(`$$Anko$Factories$ConstraintLayoutView`.GUIDELINE, theme = 0) { init() }
}

inline fun ViewManager.themedGuideline(theme: Int = 0): Guideline = themedGuideline(theme) {}
inline fun ViewManager.themedGuideline(theme: Int = 0, init: (@AnkoViewDslMarker Guideline).() -> Unit): Guideline {
return ankoView(`$$Anko$Factories$ConstraintLayoutView`.GUIDELINE, theme) { init() }
}

inline fun ViewManager.placeholder(): Placeholder = placeholder() {}
inline fun ViewManager.placeholder(init: (@AnkoViewDslMarker Placeholder).() -> Unit): Placeholder {
    return ankoView(`$$Anko$Factories$ConstraintLayoutView`.PLACEHOLDER, theme = 0) { init() }
}

inline fun ViewManager.themedPlaceholder(theme: Int = 0): Placeholder = themedPlaceholder(theme) {}
inline fun ViewManager.themedPlaceholder(theme: Int = 0, init: (@AnkoViewDslMarker Placeholder).() -> Unit): Placeholder {
return ankoView(`$$Anko$Factories$ConstraintLayoutView`.PLACEHOLDER, theme) { init() }
}

@PublishedApi
internal object `$$Anko$Factories$ConstraintLayoutViewGroup` {
    val CONSTRAINT_LAYOUT = { ctx: Context -> _ConstraintLayout(ctx) }
}

inline fun ViewManager.constraintLayout(): ConstraintLayout = constraintLayout() {}
inline fun ViewManager.constraintLayout(init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
    return ankoView(`$$Anko$Factories$ConstraintLayoutViewGroup`.CONSTRAINT_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedConstraintLayout(theme: Int = 0): ConstraintLayout = themedConstraintLayout(theme) {}
inline fun ViewManager.themedConstraintLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
return ankoView(`$$Anko$Factories$ConstraintLayoutViewGroup`.CONSTRAINT_LAYOUT, theme) { init() }
}

inline fun Context.constraintLayout(): ConstraintLayout = constraintLayout() {}
inline fun Context.constraintLayout(init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
    return ankoView(`$$Anko$Factories$ConstraintLayoutViewGroup`.CONSTRAINT_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedConstraintLayout(theme: Int = 0): ConstraintLayout = themedConstraintLayout(theme) {}
inline fun Context.themedConstraintLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
return ankoView(`$$Anko$Factories$ConstraintLayoutViewGroup`.CONSTRAINT_LAYOUT, theme) { init() }
}

inline fun Activity.constraintLayout(): ConstraintLayout = constraintLayout() {}
inline fun Activity.constraintLayout(init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
    return ankoView(`$$Anko$Factories$ConstraintLayoutViewGroup`.CONSTRAINT_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedConstraintLayout(theme: Int = 0): ConstraintLayout = themedConstraintLayout(theme) {}
inline fun Activity.themedConstraintLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ConstraintLayout).() -> Unit): ConstraintLayout {
return ankoView(`$$Anko$Factories$ConstraintLayoutViewGroup`.CONSTRAINT_LAYOUT, theme) { init() }
}

