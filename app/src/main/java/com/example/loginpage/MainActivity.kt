package com.example.loginpage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the views
        val usernameInput = findViewById<EditText>(R.id.input_username)
        val emailInput = findViewById<EditText>(R.id.input_email)
        val fullnameInput = findViewById<EditText>(R.id.input_fullname)
        val passwordInput = findViewById<EditText>(R.id.input_password)
        val signUpButton = findViewById<Button>(R.id.signUpButton)

        signUpButton.setOnClickListener{
            val username = usernameInput.text.toString()
            val email = emailInput.text.toString()
            val fullname = fullnameInput.text.toString()
            val password = passwordInput.text.toString()

            if(email.isEmpty()){
                Toast.makeText(this, "Mohon isikan Email", Toast.LENGTH_SHORT).show()
            }
            if(fullname.isEmpty()){
                Toast.makeText(this, "Mohon isikan Fullname", Toast.LENGTH_SHORT).show()
            }
            if(password.isEmpty()){
                Toast.makeText(this, "Mohon isikan Password", Toast.LENGTH_SHORT).show()
            }
            if(username.isNotEmpty()){
                Toast.makeText(this, "Selamat datang, $username", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "Mohon isikan Username", Toast.LENGTH_SHORT).show()
            }
        }
    }
}