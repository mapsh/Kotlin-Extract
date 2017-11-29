package com.mapsh.kotlin.extract

import android.app.Fragment
import android.content.Context
import com.mapsh.kotlin.extract.sp.SharedPreferenceImpl

/**
 * Created by mapsh on 2017/8/17.
 */

fun Context.sp_saveString(key: String, value: String) = SharedPreferenceImpl.saveString(this, key, value)

fun Context.sp_saveInt(key: String, value: Int) = SharedPreferenceImpl.saveInt(this, key, value)
fun Context.sp_saveBool(key: String, value: Boolean) = SharedPreferenceImpl.saveBoolean(this, key, value)
fun Context.sp_saveFloat(key: String, value: Float) = SharedPreferenceImpl.saveFloat(this, key, value)
fun Context.sp_saveLong(key: String, value: Long) = SharedPreferenceImpl.saveLong(this, key, value)
fun Context.sp_saveObject(key: String, value: Any) = SharedPreferenceImpl.saveObj(this, key, value)


fun Context.sp_getString(key: String, default: String = ""): String = SharedPreferenceImpl.getString(this, key, default)
fun Context.sp_getInt(key: String, default: Int = 0): Int = SharedPreferenceImpl.getInt(this, key, default)
fun Context.sp_getBool(key: String, default: Boolean = false): Boolean = SharedPreferenceImpl.getBoolean(this, key, default)
fun Context.sp_getFloat(key: String, default: Float = 0f): Float = SharedPreferenceImpl.getFloat(this, key, default)
fun Context.sp_getLong(key: String, default: Long = 0L): Long = SharedPreferenceImpl.getLong(this, key, default)
fun <T> Context.sp_getObject(key: String): T? = SharedPreferenceImpl.getObj(this, key)

fun Context.removeIt(key: String) = SharedPreferenceImpl.removeIt(this, key)
fun Context.sp_clear() = SharedPreferenceImpl.clear(this)


/**
 * fragment
 */

fun Fragment.sp_saveString(key: String, value: String) = activity.sp_saveString(key, value)

fun Fragment.sp_saveInt(key: String, value: Int) = activity.sp_saveInt(key, value)
fun Fragment.sp_saveBool(key: String, value: Boolean) = activity.sp_saveBool(key, value)
fun Fragment.sp_saveFloat(key: String, value: Float) = activity.sp_saveFloat(key, value)
fun Fragment.sp_saveLong(key: String, value: Long) = activity.sp_saveLong(key, value)
fun Fragment.sp_saveObject(key: String, value: Any) = activity.sp_saveObject(key, value)


fun Fragment.sp_getString(key: String, default: String = ""): String = activity.sp_getString(key, default)
fun Fragment.sp_getInt(key: String, default: Int = 0): Int = activity.sp_getInt(key, default)
fun Fragment.sp_getBool(key: String, default: Boolean = false): Boolean = activity.sp_getBool(key, default)
fun Fragment.sp_getFloat(key: String, default: Float = 0f): Float = activity.sp_getFloat(key, default)
fun Fragment.sp_getLong(key: String, default: Long = 0L): Long = activity.sp_getLong(key, default)
fun <T> Fragment.sp_getObject(key: String): T? = activity.sp_getObject(key)

fun Fragment.removeIt(key: String) = activity.removeIt(key)
fun Fragment.sp_clear() = activity.sp_clear()


/**
 * v4.fragment
 */
fun android.support.v4.app.Fragment.sp_saveString(key: String, value: String) = activity!!.sp_saveString(key, value)

fun android.support.v4.app.Fragment.sp_saveInt(key: String, value: Int) = activity!!.sp_saveInt(key, value)
fun android.support.v4.app.Fragment.sp_saveBool(key: String, value: Boolean) = activity!!.sp_saveBool(key, value)
fun android.support.v4.app.Fragment.sp_saveFloat(key: String, value: Float) = activity!!.sp_saveFloat(key, value)
fun android.support.v4.app.Fragment.sp_saveLong(key: String, value: Long) = activity!!.sp_saveLong(key, value)
fun android.support.v4.app.Fragment.sp_saveObject(key: String, value: Any) = activity!!.sp_saveObject(key, value)


fun android.support.v4.app.Fragment.sp_getString(key: String, default: String = ""): String = activity.sp_getString(key, default)
fun android.support.v4.app.Fragment.sp_getInt(key: String, default: Int = 0): Int = activity.sp_getInt(key, default)
fun android.support.v4.app.Fragment.sp_getBool(key: String, default: Boolean = false): Boolean = activity.sp_getBool(key, default)
fun android.support.v4.app.Fragment.sp_getFloat(key: String, default: Float = 0f): Float = activity.sp_getFloat(key, default)
fun android.support.v4.app.Fragment.sp_getLong(key: String, default: Long = 0L): Long = activity.sp_getLong(key, default)
fun <T> android.support.v4.app.Fragment.sp_getObject(key: String): T? = activity.sp_getObject(key)

fun android.support.v4.app.Fragment.removeIt(key: String) = activity.removeIt(key)
fun android.support.v4.app.Fragment.sp_clear() = activity.sp_clear()


/**
 * Any
 */
fun Any.sp_saveString(context: Context, key: String, value: String) = context.sp_saveString(key, value)

fun Any.sp_saveInt(context: Context, key: String, value: Int) = context.sp_saveInt(key, value)
fun Any.sp_saveBool(context: Context, key: String, value: Boolean) = context.sp_saveBool(key, value)
fun Any.sp_saveFloat(context: Context, key: String, value: Float) = context.sp_saveFloat(key, value)
fun Any.sp_saveLong(context: Context, key: String, value: Long) = context.sp_saveLong(key, value)
fun Any.sp_saveObject(context: Context, key: String, value: Any) = context.sp_saveObject(key, value)

fun Any.sp_getString(context: Context, key: String, default: String = ""): String = context.sp_getString(key, default)
fun Any.sp_getInt(context: Context, key: String, default: Int = 0): Int = context.sp_getInt(key, default)
fun Any.sp_getBool(context: Context, key: String, default: Boolean = false): Boolean = context.sp_getBool(key, default)
fun Any.sp_getFloat(context: Context, key: String, default: Float = 0f): Float = context.sp_getFloat(key, default)
fun Any.sp_getLong(context: Context, key: String, default: Long = 0L): Long = context.sp_getLong(key, default)
fun <T> Any.sp_getObject(context: Context, key: String): T? = context.sp_getObject(key)

fun Any.removeIt(context: Context, key: String) = context.removeIt(key)
fun Any.sp_clear(context: Context) = context.sp_clear()
