package com.yavuz.numberguessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.yavuz.numberguessinggame.databinding.FragmentGameOverWinBinding

class GameOverWinFragment : Fragment() {
    private lateinit var binding: FragmentGameOverWinBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this
        binding = FragmentGameOverWinBinding.inflate(inflater, container, false)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            val action = GameOverWinFragmentDirections.actionGameOverWinFragmentToImageFragment()
            findNavController().navigate(action)
        }
        binding.buttonPlayAgain.setOnClickListener {
            val action = GameOverWinFragmentDirections.actionGameOverWinFragmentToImageFragment()
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }
}