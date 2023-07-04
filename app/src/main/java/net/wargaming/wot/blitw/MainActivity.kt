package net.wargaming.wot.blitw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.wargaming.wot.blitw.ui.theme.MainNavigation
import net.wargaming.wot.blitw.ui.theme.PinkyPinkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PinkyPinkTheme {
                // A surface container using the 'background' color from the theme
                MainNavigation()
            }
        }
    }
}

