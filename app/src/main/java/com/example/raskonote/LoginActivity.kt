package com.example.raskonote

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import retrofit2.Retrofit
import kotlin.jvm.java

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.loginButton)
        button.setOnClickListener {

            val password = findViewById<EditText>(R.id.loginPassword).text.toString()
            println(password)

            if(password == "2309") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                val errorMasage = getString(R.string.login_errorMassage)
                Toast.makeText(this, errorMasage, Toast.LENGTH_SHORT).show()
            }

        }

    }
}