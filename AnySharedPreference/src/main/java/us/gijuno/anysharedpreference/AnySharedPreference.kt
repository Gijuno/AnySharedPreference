package us.gijuno.anysharedpreference

import android.content.Context
import android.widget.Toast

class AnySharedPreference {
    fun showToast(context: Context?, text: String?) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}