package com.yavuz.numberguessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.yavuz.numberguessinggame.databinding.FragmentGameBinding
import com.yavuz.numberguessinggame.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    private lateinit var binding: FragmentGameOverBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameOverBinding.inflate(inflater,container,false)

        fragmentManager = requireActivity().supportFragmentManager
        binding.buttonTryAgain.setOnClickListener {
            fragmentManager.popBackStack()
        }
        return binding.root
    }


}