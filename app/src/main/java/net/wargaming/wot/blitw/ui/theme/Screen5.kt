package net.wargaming.wot.blitw.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.wargaming.wot.blitw.R

@Composable
fun Screen5(){

    val mainFont = FontFamily(Font(R.font.roboto_medium))

    Box(modifier = Modifier.fillMaxSize()){

        Image(
            painter = painterResource(id = R.drawable.fon1080_1920),
            contentDescription = "back",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Text(
            text = stringResource(id = R.string.app_help),
            fontFamily = mainFont,
            fontSize = 28.sp,
            color = Color.Black,
            modifier = Modifier.padding(12.dp)
        )
    }
    //Settings
}