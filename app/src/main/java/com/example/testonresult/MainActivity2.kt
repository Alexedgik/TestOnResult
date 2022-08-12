package com.example.testonresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.testonresult.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val message = intent.getStringExtra("key")
        binding.tvResult2.text = message

    }
    fun onClick(view: View){
        val i = Intent()
        i.putExtra("key1", "done")
        setResult(RESULT_OK, i)
        finish()
    }
}