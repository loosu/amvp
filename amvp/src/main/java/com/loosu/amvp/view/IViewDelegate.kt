package com.loosu.kmvp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * 视图层代理接口
 */
interface IViewDelegate {

    /**
     * 视图代理的根部
     */
    var rootView: View?


    fun create(layoutInflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)

    fun init()

    fun <T : View> findViewById(viewId: Int): T

    fun setEnable(enable: Boolean, vararg viewIds: Int)

    fun setOnClickListener(listener: View.OnClickListener?, vararg viewIds: Int)
}
