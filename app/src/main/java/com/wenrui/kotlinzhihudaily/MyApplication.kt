package com.wenrui.kotlinzhihudaily

import android.app.Application
import io.realm.Realm

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/4/28
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}