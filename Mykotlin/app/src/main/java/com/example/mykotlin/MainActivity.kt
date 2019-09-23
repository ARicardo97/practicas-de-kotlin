package com.example.mykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_edad
        btn_enviar.setOnClickListener {
            edad = edt_edad.text.toString().toInt()
            if (edad >= 18){
                //dar acceso a la aplicacion
                Toast.makeText(this,"Tienes acceso a la aplicacion", Toast.LENGTH_SHORT).show()
                 var intent = Intent(this, AccesoActivity::class.java)
                intent.putExtra(Const.EDAD, edad)
                startActivity(intent)
            }else{
                //Restringir la aplicacion
                Toast.makeText(this,"No Tienes acceso a la aplicacion", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, NoAccesoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
