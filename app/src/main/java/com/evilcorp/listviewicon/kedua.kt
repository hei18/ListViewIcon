package com.evilcorp.listviewicon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pertama.*

class kedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        back.setOnClickListener(){
            intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
