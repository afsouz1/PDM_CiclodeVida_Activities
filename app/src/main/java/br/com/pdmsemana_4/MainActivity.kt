package br.com.pdmsemana_4

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("CicloDeVida", "onCreate, MainActivity - Alan Souza")

        val button = findViewById<Button>(R.id.botChangeActivity)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "onStart, MainActivity - Alan Souza")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida", "onResume, MainActivity - Alan Souza")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida", "onPause, MainActivity - Alan Souza")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "onStop, MainActivity - Alan Souza")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "onDestroy, MainActivity - Alan Souza")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloDeVida", "onRestart, MainActivity - Alan Souza")
    }

}