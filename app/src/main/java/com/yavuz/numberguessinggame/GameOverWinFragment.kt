package com.yavuz.numberguessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yavuz.numberguessinggame.databinding.FragmentGameOverWinBinding

class GameOverWinFragment : Fragment() {
    private lateinit var binding: FragmentGameOverWinBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this
        binding = FragmentGameOverWinBinding.inflate(inflater, container, false)
        binding.buttonPlayAgain.setOnClickListener {
            replaceFragment(GameFragment())
        }
        return binding.root
    }

}