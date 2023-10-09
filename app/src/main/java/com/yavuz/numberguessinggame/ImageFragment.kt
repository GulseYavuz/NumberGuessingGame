package com.yavuz.numberguessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.yavuz.numberguessinggame.databinding.FragmentImageBinding

class ImageFragment : Fragment() {
    private lateinit var binding: FragmentImageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentImageBinding.inflate(inflater, container, false)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            val action = ImageFragmentDirections.actionImageFragmentToMainFragment()
            findNavController().navigate(action)

        }
        binding.buttonPlayGame.setOnClickListener {
            val action = ImageFragmentDirections.actionImageFragmentToGameFragment()
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }
}