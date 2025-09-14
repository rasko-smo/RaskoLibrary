package com.example.raskolibrary.ui

import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.raskolibrary.R

abstract class BaseActivity : AppCompatActivity() {

    private var selectedButton: Button? = null

    protected fun createFooterEvent(footer: LinearLayout) {
        val button1 = footer.findViewById<Button>(R.id.footerButton1)
        val button2 = footer.findViewById<Button>(R.id.footerButton2)
        val button3 = footer.findViewById<Button>(R.id.footerButton3)
        val button4 = footer.findViewById<Button>(R.id.footerButton4)
        val button5 = footer.findViewById<Button>(R.id.footerButton5)
        val button6 = footer.findViewById<Button>(R.id.footerButton6)

        button1.setOnClickListener {
            changeButtonColor(button1)
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
        }
        button2.setOnClickListener {
            changeButtonColor(button2)
        }
        button3.setOnClickListener {
            changeButtonColor(button3)
        }
        button4.setOnClickListener {
            changeButtonColor(button4)
        }
        button5.setOnClickListener {
            changeButtonColor(button5)
        }
        button6.setOnClickListener {
            changeButtonColor(button6)
        }

        changeButtonColor(button1)
    }

    private fun changeButtonColor(button: Button) {
        if (selectedButton != null) {
            selectedButton?.background = getDrawable(R.drawable.common_green_button)
            selectedButton?.setTextColor(getColor(R.color.white))
        }

        button?.background = getDrawable(R.drawable.common_white_button)
        button?.setTextColor(getColor(R.color.common_green))

        selectedButton = button
    }
}