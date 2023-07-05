package net.wargaming.wot.blitw.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import net.wargaming.wot.blitw.R


@Composable
fun Screen3() {

    //Game

    Box(modifier = Modifier.fillMaxSize()){
        //Main box full screen

        Image(
            painter = painterResource(id = R.drawable.fon1080_1920),
            contentDescription = "general background",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .padding(bottom = 64.dp)) {

            Box(modifier = Modifier
                .fillMaxWidth(0.7f)
                .align(Alignment.CenterHorizontally)

            ){
                //Game surface

                Image(
                    painter = painterResource(id = R.drawable.element_7),
                    contentDescription = "game surface",
                    modifier = Modifier
                        .align(Alignment.Center)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(4),
                    modifier = Modifier
                        .fillMaxWidth(),
                    content = {
                        items(20){
                            Box(modifier = Modifier.padding(12.dp)){
                                Image(painter = painterResource(id = R.drawable.element_1), contentDescription = "element")
                            }
                        }
                    }
                )
            }
        }
    }
}