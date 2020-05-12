package com.example.androidproiect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.MainThread
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTrimiteMesajul.setOnClickListener {
            val message: String = etMesajUtilizator.text.toString()

            val intent = Intent(this, SecondActivity::class.java )

            intent.putExtra("mesaj_utilizator", message)
            startActivity(intent)
        }

        btnShare.setOnClickListener {

            val message: String = etMesajUtilizator.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to: "))

        }

        btnRecyclerView.setOnClickListener {

            val intent = Intent(this, HobbiesActivity::class.java )
            startActivity(intent)

        }
    }
}
