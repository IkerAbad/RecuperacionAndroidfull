package com.example.recuperacionandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.recuperacionandroid.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private  lateinit var binding: FragmentDetailBinding

    //Recibir argumentos
    val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        //SafeArgs
        val nombre = args.nombre
        val apellido = args.apellido
        val mail = args.mail
        val year = args.year
        val numero = args.numero

        binding.textViewNombre.setText(nombre)
        binding.textViewApellido.setText(apellido)
        binding.textViewMail.setText(mail)
        binding.textViewYear.setText(year)
        binding.textViewYear.setText(numero)

    }
}
