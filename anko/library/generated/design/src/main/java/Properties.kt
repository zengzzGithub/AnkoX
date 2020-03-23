@file:JvmName("DesignPropertiesKt")
package org.jetbrains.anko.design

import com.google.android.material.textfield.TextInputLayout
import org.jetbrains.anko.*

import org.jetbrains.anko.internals.AnkoInternals
import kotlin.DeprecationLevel

var TextInputLayout.passwordVisibilityToggleContentDescriptionResource: Int
    @Deprecated(AnkoInternals.NO_GETTER, level = DeprecationLevel.ERROR) get() = AnkoInternals.noGetter()
    set(v) = setPasswordVisibilityToggleContentDescription(v)

var TextInputLayout.passwordVisibilityToggleDrawableResource: Int
    @Deprecated(AnkoInternals.NO_GETTER, level = DeprecationLevel.ERROR) get() = AnkoInternals.noGetter()
    set(v) = setPasswordVisibilityToggleDrawable(v)

