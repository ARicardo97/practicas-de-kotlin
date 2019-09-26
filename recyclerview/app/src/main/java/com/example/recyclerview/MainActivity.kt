package com.example.recyclerview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_muro.*

class MainActivity : AppCompatActivity() {

    var muro = ArrayList<Muro>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data() //usamos la funcion data
        mainActivity.layoutManager = LinearLayoutManager(this)  //traemos el id del mainActivity donde tenemos el recyclerview
        mainActivity.adapter = MuroAdapter(muro)
        alert()
    }

    //añadiendo datos
    fun data(){
        muro.add(Muro(R.drawable.ic_bike, "Viaja en bici", R.drawable.ic_sentiment,"Ricardo"))
        muro.add(Muro(R.drawable.ic_local_library, "feliz cumple", R.drawable.ic_sentiment_neutral,"wey"))
        muro.add(Muro(R.drawable.ic_hot_tub, "que piensas", R.drawable.ic_sentiment_very,"otras"))


        muro.add(Muro(R.drawable.ic_bike, "Viaja en bici", R.drawable.ic_sentiment,"Ricardo"))
        muro.add(Muro(R.drawable.ic_local_library, "feliz cumple", R.drawable.ic_sentiment_neutral,"wey"))
        muro.add(Muro(R.drawable.ic_hot_tub, "que piensas", R.drawable.ic_sentiment_very,"otras"))
    }

    //CREANDO ALERTDIALOG
    fun alert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Información")
        builder.setMessage("El usuario que se presenta.Está realizando una actividad")
        builder.setPositiveButton("Aceptar", null)
        builder.show()
        //imagen = ImageView(this).findViewById(R.id.imv_foto_post)
        //imagen.setOnClickListener { v -> Toast.makeText(this,"skjajklsj", Toast.LENGTH_SHORT).show() }
    }
}
