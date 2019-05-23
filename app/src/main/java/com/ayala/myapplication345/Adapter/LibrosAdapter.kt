package com.ayala.myapplication345.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayala.myapplication345.R
import com.ayala.myapplication345.models.Libro
import kotlinx.android.synthetic.main.cardview_libro.view.*

class LibrosAdapter(val libros: List<Libro>): RecyclerView.Adapter<LibrosAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibrosAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_libro, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount()=libros.size

    override fun onBindViewHolder(holder: LibrosAdapter.ViewHolder, position: Int) = holder.bind(libros[position])

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        lateinit var tvTitulo: TextView
        lateinit var tvEdicion: TextView
        lateinit var tvEditorial: TextView
        lateinit var tvISBN: TextView
        lateinit var tvResumen: TextView

        fun bind(libro: Libro) = with(itemView){
            tvTitulo =  findViewById(R.id.titulo)
            tvTitulo.text = libro.titulo
            tvEdicion =  findViewById(R.id.edicion)
            tvEdicion.text = libro.edicion.toString()
            tvEditorial =  findViewById(R.id.editorial)
            tvEditorial.text = libro.editorial
            tvISBN =  findViewById(R.id.isbn)
            tvISBN.text = libro.isbn.toString()
            tvResumen =  findViewById(R.id.resumen)
            tvResumen.text = libro.resumen
        }
    }

}