package com.example.juego_memoria_app

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class Toolbar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toolbar)

            val imagenView = ImageView(this)
            Glide.with(this)
                .asGif()
                .load("https://reygif.com/gif/signo-interrogacion-50116")
                .into(imagenView)
    }
}