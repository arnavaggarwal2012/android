package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btnLogin)
        val etUserName: TextInputEditText =findViewById(R.id.etUsername)
        val etPassword: TextInputEditText=findViewById(R.id.etPassword)

        val usernameLayoutText: TextInputLayout =findViewById(R.id.etUsername)
        val passwordLayoutText: TextInputLayout=findViewById(R.id.etPassword)
        btn.setOnClickListener{
// TODO 1: GET VALUE FROM ETS
            val username=etUserName.text.toString() // give not nullable string
            val password=etPassword.text.toString()
            //TODO 3: edittask ask for username ans password
            if(username.isBlank()){
                usernameLayoutText.error="Pls valid username"
            }
            if(password.isBlank()){
                passwordLayoutText.error="pls enter valid password"
            }
            //todo 4 : toast
            Toast.makeText(this@MainActivity,"login successful",Toast.LENGTH_SHORT).show()
        }
    }
}
private fun checkFormDetails(username:String,password:String): Boolean {
    return !(username.isBlank() || password.isEmpty())
}

//TODO FINAL Understand how to clear
