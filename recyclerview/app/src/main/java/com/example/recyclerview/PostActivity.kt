package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        //elementos del post Activity
        post_img.setImageResource(intent.getIntExtra(Constantes.FOTO,0))
        post_texto.text = intent.getStringExtra(Constantes.POST)

        btn_post.setOnClickListener(){
            var intent = Intent(btn_post.context, MainActivity::class.java) //regresando al principal
            btn_post.context.startActivity(intent)
        }
    }
}
