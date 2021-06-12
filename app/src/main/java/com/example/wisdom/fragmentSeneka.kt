package com.example.wisdom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wisdom.adapter.ItemAdapter
import com.example.wisdom.data.SenekaQuote
import com.example.wisdom.databinding.FragmentSenekaBinding


class fragmentSeneka : Fragment() {

    private var _binding: FragmentSenekaBinding? = null
    private val binding get()= _binding!!
    private lateinit var recycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSenekaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recycler = binding.recyclerView
        val dataSeneka = SenekaQuote().loadQuote()
        val adapter = ItemAdapter(view.context, dataSeneka)
        recycler.adapter = adapter
    }
}

