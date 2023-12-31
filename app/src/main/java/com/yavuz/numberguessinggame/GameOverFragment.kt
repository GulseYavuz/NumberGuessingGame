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
import com.yavuz.numberguessinggame.databinding.FragmentGameBinding
import com.yavuz.numberguessinggame.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    private lateinit var binding: FragmentGameOverBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameOverBinding.inflate(inflater,container,false)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            val action = GameOverFragmentDirections.actionGameOverFragmentToImageFragment()
            findNavController().navigate(action)
        }

        binding.buttonTryAgain.setOnClickListener {
            val action = GameOverFragmentDirections.actionGameOverFragmentToImageFragment()
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }


}