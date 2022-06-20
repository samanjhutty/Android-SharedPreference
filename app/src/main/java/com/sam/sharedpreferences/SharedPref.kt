package com.sam.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class SharedPref(context:Context) {
    private val pref:SharedPreferences=context.getSharedPreferences("sharepref", Context.MODE_PRIVATE)
    private var editor:SharedPreferences.Editor=pref.edit()

    fun savepref(x:String){
        editor.putString("pref",x)
        editor.apply()
        editor.commit()
    }

    fun getpref():String?{

        return pref.getString("pref","")
    }

}
