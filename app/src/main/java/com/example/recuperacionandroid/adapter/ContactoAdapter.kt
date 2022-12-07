package com.example.recuperacionandroid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.recuperacionandroid.ListFragmentDirections
import com.example.recuperacionandroid.R
import com.example.recuperacionandroid.model.Contactos

class ContactoAdapter(val context: Context, val dataset: List<Contactos>): RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder>() {

    class ContactoViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nombre: TextView = view.findViewById(R.id.nombre)
        val apellido: TextView = view.findViewById(R.id.apellido)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_contactos, parent, false)
        return ContactoViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ContactoViewHolder, position: Int) {
        //Binding
        val item = dataset[position]
        holder.nombre.text = context.resources.getString(item.nombre)
        holder.apellido.text = context.resources.getString(item.apellido)

        //Navegacion Details
        holder.apellido.setOnClickListener{view ->
            //SafeArgs
            val nombre = item.nombre
            val apellido = item.apellido
            val mail = item.mail
            val year = item.year
            val numero = item.numero
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(nombre.toString(),
                apellido.toString(), mail.toString(),year,numero)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int =dataset.size

}