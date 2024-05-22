package com.example.monapplicationrepas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Créer un handler pour le thread principal
        Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    // Après 2 secondes, démarrer HomeActivity
                    startActivity(Intent(this, HomeActivity::class.java))
                    // Fermer l'activité actuelle
                    finish()
                },2000 // Attendre 2 secondes (2000 millisecondes)
            )

    }
}