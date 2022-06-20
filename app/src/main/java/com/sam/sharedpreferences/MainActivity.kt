package com.sam.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val context=SharedPref(this)

        findViewById<Button>(R.id.btnSave).setOnClickListener{
            context.savepref(findViewById<EditText>(R.id.etMessage).text.toString())
            Toast.makeText(this, "data saved in cache memory", Toast.LENGTH_SHORT).show()

        }

        findViewById<Button>(R.id.btnShow).setOnClickListener{
            val pref=context.getpref().toString()
            findViewById<TextView>(R.id.tvMessage).text = pref
        }
    }
}