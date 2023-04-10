package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.myapplication.databinding.ActivityMainBinding

const val TAG = "X"

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    fun main() {
        val jane: Person = Person("Jane", 32)
        val mike: Person = Person("Mike", 19, "Smith")

        println("Name: ${jane.name}, Age: ${jane.age}")
        println("Name: ${mike.name}, Age: ${mike.age}, LastName: ${mike.lastName}")

        val equals = jane==mike
            binding.textResultEquals.text = equals.toString()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        main()
    }

    override fun onStart() {
        Log.d(TAG, "MainActivity BEFORE_ON_START")
        super.onStart()
        Log.d(TAG, "MainActivity ON_START")
    }

    override fun onResume() {
        Log.d(TAG, "MainActivity BEFORE_ON_RESUME")
        super.onResume()
        Log.d(TAG, "MainActivity ON_RESUME")
    }

    override fun onPause() {
        Log.d(TAG, "MainActivity BEFORE_ON_PAUSE")
        super.onPause()
        Log.d(TAG, "MainActivity ON_PAUSE")
    }

    override fun onStop() {
        Log.d(TAG, "MainActivity BEFORE_ON_STOP")
        super.onStop()
        Log.d(TAG, "MainActivity ON_STOP")
    }

    override fun onDestroy() {
        Log.d(TAG, "MainActivity BEFORE_ON_DESTROY")
        super.onDestroy()
        Log.d(TAG, "MainActivity ON_DESTROY")
    }



}

