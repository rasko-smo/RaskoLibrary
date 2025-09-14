package com.example.raskonote.ui

import android.os.Bundle
import android.widget.LinearLayout
import com.example.raskonote.R

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val footer = findViewById<LinearLayout>(R.id.commonFooter)
        createFooterEvent(footer)
    }


}