package com.example.wisdom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.wisdom.databinding.FragmentMenuBinding


class fragmentMenu : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get()= _binding!!
    private lateinit var constraint: ConstraintLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        constraint = binding.constraintLayoutMenu

       binding.senekaImg.setOnClickListener {
           val action = fragmentMenuDirections.actionFragmentMenuToFragmentSeneka()
           findNavController().navigate(action)
       }
    }
}

