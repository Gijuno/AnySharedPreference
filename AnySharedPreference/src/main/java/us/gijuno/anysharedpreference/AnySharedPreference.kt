package us.gijuno.anysharedpreference

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class AnySharedPreference(context: Context) : Application() {
    private val prefs: SharedPreferences =
        context.getSharedPreferences("AnySharedPreference", Context.MODE_PRIVATE)

    fun setString(key: String, str: String) {
        prefs.edit().putString(key, str).apply()
    }

    fun getString(key: String, defValue: String): String {
        return prefs.getString(key, defValue).toString()
    }

    fun setInt(key: String, value: Int) {
        prefs.edit().putInt(key, value).apply()
    }

    fun getInt(key: String, defValue: Int): Int {
        return prefs.getInt(key, defValue)
    }

    fun setBoolean(key: String, value: Boolean) {
        prefs.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String, defValue: Boolean): Boolean {
        return prefs.getBoolean(key, defValue)
    }

    fun setFloat(key: String, value: Float) {
        prefs.edit().putFloat(key, value).apply()
    }

    fun getFloat(key: String, defValue: Float): Float {
        return prefs.getFloat(key, defValue)
    }

    fun setArray(key: String, value: Array<String>, separator: String) {
        prefs.edit().putString(key, value.joinToString(separator)).apply()
    }

    fun getArray(key: String, defValue: Array<String>, separator: String): Array<String> {
        return prefs.getString(key, defValue.joinToString(separator))!!.split(separator).toTypedArray()
    }

    fun setList(key: String, value: List<String>, separator: String) {
        prefs.edit().putString(key, value.joinToString(separator)).apply()
    }

    fun getList(key: String, defValue: List<String>, separator: String): List<String> {
        return prefs.getString(key, defValue.joinToString(separator))!!.split(separator)
    }

    fun setArrayList(key: String, value: ArrayList<String>, separator: String) {
        return prefs.edit().putString(key, value.joinToString(separator)).apply()
    }
}


// 데이터 저장
// SharedPreference.prefs.setString("email", "abcd@gmail.com")
// 데이터 조회
// SharedPreference.prefs.getString("email", "no email")