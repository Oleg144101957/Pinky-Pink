package net.wargaming.wot.blitw.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.wargaming.wot.blitw.R

@Composable
fun Screen4(){


    val state1 = remember {
        mutableStateOf(false)
    }

    val state2 = remember {
        mutableStateOf(false)
    }

    val state3 = remember {
        mutableStateOf(true)
    }

    val state4 = remember {
        mutableStateOf(true)
    }

    val state5 = remember {
        mutableStateOf(false)
    }

    val state6 = remember {
        mutableStateOf(true)
    }

    val state7 = remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier.fillMaxSize()){

        Image(
            painter = painterResource(id = R.drawable.fon1080_1920),
            contentDescription = "back",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column(modifier = Modifier
            .fillMaxWidth()
        ) {
            CheckBoxFun(checkedState = state1, text = "Sound Settings")
            CheckBoxFun(checkedState = state2, text = "Notifications Settings")
            CheckBoxFun(checkedState = state3, text = "App Permissions")
            CheckBoxFun(checkedState = state4, text = "Data Usage")
            CheckBoxFun(checkedState = state5, text = "Language & Input")
            CheckBoxFun(checkedState = state6, text = "Display & Brightness")
            CheckBoxFun(checkedState = state7, text = "Sound & Vibration")
        }
    }
}


@Composable
fun CheckBoxFun(checkedState: MutableState<Boolean>, text: String){


    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)

    ) {
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )

        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}