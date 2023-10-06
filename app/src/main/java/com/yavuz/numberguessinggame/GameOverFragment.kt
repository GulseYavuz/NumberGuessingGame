package com.yavuz.numberguessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        binding.buttonTryAgain.setOnClickListener {
            replaceFragment(GameFragment())
        }
        return binding.root
    }

}