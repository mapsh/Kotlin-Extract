package com.mapsh.android.kotlinutildemo

import android.app.Application
import com.mapsh.kotlinx.extract.impl.LogImpl
import com.mapsh.kotlinx.extract.sp.SharedPreferenceImpl

/**
 * Created by mapsh on 2017/8/17.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPreferenceImpl.init(this, "nama")

        LogImpl.init(BuildConfig.DEBUG, "app")
    }

}