package com.example.residencia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1=findViewById<Button>(R.id.alumno)
       // boton1.setOnClickListener { val intent=intent(this,login::cl startActivity(login)) }
    }
}


