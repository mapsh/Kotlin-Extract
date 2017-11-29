package com.mapsh.kotlin.extract

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Fragment
import android.os.Build
import android.os.Looper
import com.mapsh.kotlin.extract.thread.BackgroundExecutor
import java.util.concurrent.Future

/**
 * Created by mapsh on 2017/8/17.
 */


inline fun _async(crossinline f: () -> Unit) {
    BackgroundExecutor.submit {
        f()
    }
}

@SuppressLint("ObsoleteSdkInt")
inline fun Activity?._runUI(crossinline f: () -> Unit) {
    if (Thread.currentThread() == Looper.getMainLooper().thread) {
        f()
    } else {
        if (this == null) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            if (this.isDestroyed) this.runOnUiThread { f() }
        } else {
            this.runOnUiThread {
                f()
            }
        }

    }
}


private val crashLogger = { throwable: Throwable -> throwable.printStackTrace() }

fun <T> T._async(
        exceptionHandler: ((Throwable) -> Unit)? = crashLogger,
        f: T.() -> Unit
): Future<Unit> {
    return BackgroundExecutor.submit {
        return@submit try {
            f()
        } catch (thr: Throwable) {
            val result = exceptionHandler?.invoke(thr)
            if (result != null) {
                result
            } else {
                Unit
            }
        }
    }
}

inline fun Fragment?._runUI(crossinline f: () -> Unit) {
    this?.activity?._runUI { f() }
}


inline fun android.support.v4.app.Fragment?._runUI(crossinline f: () -> Unit) {
    this?.activity?._runUI { f() }
}


inline fun _runUI(crossinline f: () -> Unit) {
    BackgroundExecutor.handler.post { f() }

}