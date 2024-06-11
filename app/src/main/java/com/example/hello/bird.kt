package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class bird : AppCompatActivity() {
        lateinit var binding: ActivityBirdBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityBirdBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.btnNext3.setOnClickListener {
                val intent = Intent(this, lastbird::class.java)
                startActivity(intent)
            }
            Picasso
                .get()
                .load("https://media.istockphoto.com/id/1458515349/photo/chaffinch-on-branch-the-netherlands.jpg?s=2048x2048&w=is&k=20&c=OWd3rS1n6x2Du0stJKYMv4Ewmizaf-w8-ZZSRXTFW34=")
                .into(binding.btnNext3)
        }
    }

