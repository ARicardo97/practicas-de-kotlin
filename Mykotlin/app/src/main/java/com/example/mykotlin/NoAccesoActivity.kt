package com.example.mykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_no_acceso.*

class NoAccesoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_acceso)

       btn_regresar.setOnClickListener {
           var intent = Intent(this,MainActivity::class.java)
           startActivity(intent)
       }
    }
}
