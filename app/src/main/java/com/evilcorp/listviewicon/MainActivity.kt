package com.evilcorp.listviewicon

import  android.R.layout.simple_list_item_1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click1.setOnClickListener(){
            intent = Intent (this, pertama::class.java)
            startActivity(intent)
        }
        click2.setOnClickListener(){
            intent = Intent (this, kedua::class.java)
            startActivity(intent)
        }
        click3.setOnClickListener(){
            intent = Intent (this, ketiga::class.java)
            startActivity(intent)
        }
        click4.setOnClickListener(){
            intent = Intent (this, empat::class.java)
            startActivity(intent)
        }
        click5.setOnClickListener(){
            intent = Intent (this, lima::class.java)
            startActivity(intent)
        }
        click6.setOnClickListener(){
            intent = Intent (this, enam::class.java)
            startActivity(intent)
        }
        click7.setOnClickListener(){
            intent = Intent (this, tuju::class.java)
            startActivity(intent)
        }

    }
}
