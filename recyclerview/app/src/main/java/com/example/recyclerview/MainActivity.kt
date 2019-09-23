package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var muro = ArrayList<Muro>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data() //usamos la funcion data
    }

    //añadiendo datos
    fun data(){
        muro.add(Muro(R.drawable.ic_bike, "Viaja en bici", R.drawable.ic_sentiment,"Ricardo"))
    }
}
