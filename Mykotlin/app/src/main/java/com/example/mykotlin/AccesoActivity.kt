package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acceso.*

class AccesoActivity : AppCompatActivity() {

    var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceso)

        //recuperamos el valor
        edad = intent.getIntExtra(Const.EDAD, 0)
        acceso_TxAcceso.setText(edad.toString()) //edad es un entero asi que lo pasamos a tostring
    }
}
