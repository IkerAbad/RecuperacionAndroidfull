package com.example.recuperacionandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.recuperacionandroid.adapter.ContactoAdapter
import com.example.recuperacionandroid.data.Datasource
import com.example.recuperacionandroid.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myDataset = Datasource().loadContactos()
        val recyclerView = binding.listContactos

        recyclerView.adapter = ContactoAdapter(this.requireContext(), myDataset)
        recyclerView.setHasFixedSize(true)
    }

}