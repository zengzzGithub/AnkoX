@file:JvmName("CardviewV7ViewsKt")
package org.jetbrains.anko.cardview.v7

import org.jetbrains.anko.custom.*
import org.jetbrains.anko.AnkoViewDslMarker
import android.view.ViewManager
import android.view.ViewGroup.LayoutParams
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.Build
import android.widget.*
import androidx.cardview.widget.CardView

@PublishedApi
internal object `$$Anko$Factories$CardviewV7ViewGroup` {
    val CARD_VIEW = { ctx: Context -> _CardView(ctx) }
}

inline fun ViewManager.cardView(): CardView = cardView() {}
inline fun ViewManager.cardView(init: (@AnkoViewDslMarker _CardView).() -> Unit): CardView {
    return ankoView(`$$Anko$Factories$CardviewV7ViewGroup`.CARD_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedCardView(theme: Int = 0): CardView = themedCardView(theme) {}
inline fun ViewManager.themedCardView(theme: Int = 0, init: (@AnkoViewDslMarker _CardView).() -> Unit): CardView {
return ankoView(`$$Anko$Factories$CardviewV7ViewGroup`.CARD_VIEW, theme) { init() }
}

inline fun Context.cardView(): CardView = cardView() {}
inline fun Context.cardView(init: (@AnkoViewDslMarker _CardView).() -> Unit): CardView {
    return ankoView(`$$Anko$Factories$CardviewV7ViewGroup`.CARD_VIEW, theme = 0) { init() }
}

inline fun Context.themedCardView(theme: Int = 0): CardView = themedCardView(theme) {}
inline fun Context.themedCardView(theme: Int = 0, init: (@AnkoViewDslMarker _CardView).() -> Unit): CardView {
return ankoView(`$$Anko$Factories$CardviewV7ViewGroup`.CARD_VIEW, theme) { init() }
}

inline fun Activity.cardView(): CardView = cardView() {}
inline fun Activity.cardView(init: (@AnkoViewDslMarker _CardView).() -> Unit): CardView {
    return ankoView(`$$Anko$Factories$CardviewV7ViewGroup`.CARD_VIEW, theme = 0) { init() }
}

inline fun Activity.themedCardView(theme: Int = 0): CardView = themedCardView(theme) {}
inline fun Activity.themedCardView(theme: Int = 0, init: (@AnkoViewDslMarker _CardView).() -> Unit): CardView {
return ankoView(`$$Anko$Factories$CardviewV7ViewGroup`.CARD_VIEW, theme) { init() }
}

