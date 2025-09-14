package com.example.raskonote.ui

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.raskonote.R

abstract class BaseActivity : AppCompatActivity() {

    protected fun createFooterEvent(footer: LinearLayout) {
        val button1 = footer.findViewById<Button>(R.id.footerButton1)
        val button2 = footer.findViewById<Button>(R.id.footerButton2)
        val button3 = footer.findViewById<Button>(R.id.footerButton3)
        val button4 = footer.findViewById<Button>(R.id.footerButton4)
        val button5 = footer.findViewById<Button>(R.id.footerButton5)
        val button6 = footer.findViewById<Button>(R.id.footerButton6)

        button1.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}