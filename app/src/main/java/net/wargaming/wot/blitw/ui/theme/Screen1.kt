package net.wargaming.wot.blitw.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.wargaming.wot.blitw.R


@Composable
fun Screen1(navigation: NavHostController){

    val main_font = FontFamily(Font(R.font.roboto_medium))

    //Loading
    Box(modifier = Modifier
        .fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.fon1080_1920),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        
        Text(
            text = "Loading",
            fontSize = 32.sp,
            fontFamily = main_font,
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}