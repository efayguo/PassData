package com.example.passdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var userName: String? = null
    var userEmail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        userName = intent.getStringExtra("USERNAME")
        userEmail = intent.getStringExtra("USEREMAIL")

        if (userName != null && userName != "" && userEmail != null && userEmail != "") {
            userTV.text = "Name: $userName \nEmail: $userEmail"
        } else {
            Toast.makeText(this, "The user name or user email is null", Toast.LENGTH_SHORT).show()
        }
    }

    fun goback(view: View) {
        onBackPressed()
    }

}