package com.example.testonresult

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.testonresult.databinding.ActivityMain2Binding
import com.example.testonresult.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
   private var launcher:ActivityResultLauncher<Intent>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult ->

            if (result.resultCode == RESULT_OK){
                val text = result.data?.getStringExtra("key1")
                val tvResult = findViewById<TextView>(R.id.tvResult)
                tvResult.text = text
            }
        }
    }

   fun onClick(view: View){

       launcher?.launch(Intent(this, MainActivity2::class.java))
   }
}

