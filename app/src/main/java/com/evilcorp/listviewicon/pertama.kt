package com.evilcorp.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_pertama.*

class pertama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertama)

        back.setOnClickListener(){
            intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
