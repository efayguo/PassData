package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var userName: String? = null
    var userEmail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToNextPage (view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        userName = nameInput.text.toString()
        userEmail = emailInput.text.toString()

        if (userName != null && nameInput.text.isEmpty() == false && userEmail != null && emailInput.text.isEmpty() == false) {

            intent.putExtra("USERNAME",userName)
            intent.putExtra("USEREMAIL", userEmail)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please input your name and email", Toast.LENGTH_SHORT).show()
        }

    }
}