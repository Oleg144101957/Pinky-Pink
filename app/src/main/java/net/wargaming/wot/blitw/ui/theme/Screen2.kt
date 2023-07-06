package net.wargaming.wot.blitw.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.wargaming.wot.blitw.R

@Composable
fun Screen2(navigation: NavHostController){
    //Launcher

    Box(modifier = Modifier.fillMaxSize()){

        Image(
            painter = painterResource(id = R.drawable.fon1080_1920),
            contentDescription = "background",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(id = R.drawable.element_13),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(24.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.element_10),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 24.dp, top = 96.dp)
        )
        
        Image(
            painter = painterResource(id = R.drawable.element_15),
            contentDescription = "girl",
            modifier = Modifier.align(Alignment.BottomStart)
        )

        Column(modifier = Modifier
            .padding(bottom = 48.dp)
            .align(Alignment.BottomEnd)
        ) {
            Button(navigation = navigation, text = "Play", destination = Screen.Screen3.route)
            Button(navigation = navigation, text = "Settings", destination = Screen.Screen4.route)
            Button(navigation = navigation, text = "Help", destination = Screen.Screen5.route)
        }
    }
}

@Composable
fun Button(navigation: NavHostController, text: String, destination: String){

    val mainFont = FontFamily(Font(R.font.roboto_medium))

    Box(modifier = Modifier.fillMaxWidth()){
        Image(
            painter = painterResource(id = R.drawable.element_18),
            contentDescription = "button back",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable {
                    navigation.navigate(destination)
                }
        )

        Text(
            text = text,
            color = Color.White,
            fontSize = 24.sp,
            fontFamily = mainFont,
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}