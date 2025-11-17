package so.onetoken.app.wallet.lite.utils

import so.onetoken.app.wallet.lite.onetokenLite.NfcConstant
import so.onetoken.app.wallet.lite.LoggerManager

object LogUtil {
    @JvmStatic
    fun printLog(tag: String, msg: String) {
        if (NfcConstant.DEBUG) LoggerManager.getInstance()?.logInfo("$tag: $msg")
    }
}
