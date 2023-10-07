package com.yavuz.numberguessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.yavuz.numberguessinggame.databinding.FragmentGameOverWinBinding

class GameOverWinFragment : Fragment() {
    private lateinit var binding: FragmentGameOverWinBinding
    private lateinit var fragmentManager: FragmentManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this
        binding = FragmentGameOverWinBinding.inflate(inflater, container, false)

        fragmentManager = requireActivity().supportFragmentManager
        binding.buttonPlayAgain.setOnClickListener {
            fragmentManager.popBackStack()
        }
        return binding.root


    }

}