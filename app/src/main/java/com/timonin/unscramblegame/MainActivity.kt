package com.timonin.unscramblegame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.timonin.unscramblegame.ui.theme.UnscrambleGameTheme
import com.timonin.unscramblegame.ui_model.GameScreen
import kotlinx.serialization.modules.serializersModuleOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnscrambleGameTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {innerPadding -> GameScreen(
                    modifier = Modifier.padding(innerPadding)
                ) }

            }
        }
    }
}

