package com.example.uas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class InfoActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        val homeBtn: MaterialButton = findViewById(R.id.btn_next)

        homeBtn.setOnClickListener{
            val Intent = Intent(this,HomeFragment::class.java)
            startActivity(Intent)
        }
    }
}