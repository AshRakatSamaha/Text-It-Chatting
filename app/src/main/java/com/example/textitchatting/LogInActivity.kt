package com.example.textitchatting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textitchatting.databinding.ActivityLoginBinding

class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        callbackButton()
    }

    private fun callbackButton() {

       binding.btnLogin.setOnClickListener {
           navigateToSignup()
       }

    }
    private fun navigateToSignup() {

        val intent= Intent(this, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }
}