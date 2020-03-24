package com.example.android_test

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk28.listeners.onCheckedChange
import org.jetbrains.anko.sdk28.listeners.onClick

open class AndroidListenerHelpersTestActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        UI {
            linearLayout {
               button {
                  onClick {
                      text = "clicked"
                  }
               }
               checkBox {
                  onCheckedChange { _, checkState ->
                        if(checkState)
                            text = "checked"
                  }
               }
            }
        }
    }


}
