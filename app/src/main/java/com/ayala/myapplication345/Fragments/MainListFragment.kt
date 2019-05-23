package com.ayala.myapplication345.Fragments


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.ayala.myapplication345.Adapter.LibrosAdapter

import com.ayala.myapplication345.R
import com.ayala.myapplication345.models.Libro
import kotlinx.android.synthetic.main.fragment_main_list.*
import kotlinx.android.synthetic.main.fragment_main_list.view.*


class MainListFragment : Fragment() {

     lateinit var Adapterbook : LibrosAdapter
    var listenerTool :  AddFavorite? = null
    lateinit var recyclerView:RecyclerView
   // private lateinit var  lib :ArrayList<Libro>



    interface AddFavorite{

        fun favorite(bookName: String)



    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_main_list, container, false)
        //lib.add(Libro(1,"ssfs", 2,"sgsgs", 23, "reusmen"))
        recyclerView = view.findViewById(R.id.libros_list_rv)
        initRecycler(view)

        return view
    }

    fun initRecycler(container:View){
        val linearLayoutManager = LinearLayoutManager(this.context)

        //Adapterbook= LibrosAdapter((lib))


        container.libros_list_rv.apply {
            setHasFixedSize(true)
            adapter = Adapterbook
            layoutManager = linearLayoutManager
            //layoutManager = linearLayoutManager

        }

    }

    /*override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is AddFavorite) {
            listenerTool = context
        } else {
            throw RuntimeException("Se necesita una implementación de  la interfaz")
        }
    }
*/



}
