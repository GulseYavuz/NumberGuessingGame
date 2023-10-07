package com.yavuz.numberguessinggame

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import com.yavuz.numberguessinggame.databinding.FragmentGameBinding
import kotlinx.coroutines.delay
import kotlin.random.Random

class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    private var randomInt: String = ""
    private var remainingGuess = 5

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        randomInt = Random.nextInt(1,50).toString()
        Log.i("RANDOM NUMBER", "RANDOM NUMBER: $randomInt")

        binding.buttonGuess.setOnClickListener {
            binding.imageViewUp.visibility = View.GONE
            binding.imageViewDown.visibility = View.GONE
            binding.imageViewWin.visibility = View.GONE

            var userGuess = binding.editTextGuess.text.toString()

            if(userGuess > randomInt)
                binding.imageViewDown.visibility = View.VISIBLE

            else if (userGuess < randomInt)
                binding.imageViewUp.visibility = View.VISIBLE

            else binding.imageViewWin.visibility = View.VISIBLE

            remainingGuess --


            binding.textViewGame.text = "Kalan Tahmin Hakkınız:  $remainingGuess"

            if(remainingGuess == 0) {
                replaceFragment(GameOverFragment())
            }
            else if (userGuess == randomInt){
                replaceFragment(GameOverWinFragment())
            }
        }
    }
}