package com.example.motionlayout2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motionlayout2.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewSimple.text = "654844683543"


    }
}