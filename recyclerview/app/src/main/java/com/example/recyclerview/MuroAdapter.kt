package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_muro.view.*

class MuroAdapter(val muro: ArrayList<Muro>) :RecyclerView.Adapter<MuroAdapter.MuroViewHolder>() {

    //inflamos la vista en la que se encuentra los items
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuroViewHolder {
        var  layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_muro,parent,false)
        return MuroViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return muro.size
    }

    override fun onBindViewHolder(holder: MuroViewHolder, position: Int) {
        val itemMuro = muro[position]
        holder.bindMuro(itemMuro)
    }

    //usando la clase muro y adaptando las id de list item(layout)
    class MuroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindMuro(muro1: Muro){

            itemView.setOnClickListener(){
                val intent = Intent(itemView.context, PostActivity::class.java)
                //le mandamos los parametros
                intent.putExtra(Constantes.FOTO, muro1.foto)
                intent.putExtra(Constantes.POST, muro1.post)
                itemView.context.startActivity(intent)
            }

            itemView.imv_foto_post.setImageResource(muro1.foto)
            itemView.txt_post.text = muro1.post
            itemView.imv_foto_user.setImageResource(muro1.fotoUser)
            itemView.txt_user.text = muro1.nameUser
        }
    }
}