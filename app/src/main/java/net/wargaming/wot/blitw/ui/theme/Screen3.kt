package net.wargaming.wot.blitw.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import net.wargaming.wot.blitw.R


@Composable
fun Screen3(gameViewModel: GameViewModel = viewModel()) {

    val mainFont = FontFamily(Font(R.font.roboto_medium))

    val listOfElements = gameViewModel.liveState.collectAsState


    //Game View Model error

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
            .padding(12.dp)
            .align(Alignment.TopStart)

        ) {
            Image(painter = painterResource(id = R.drawable.element_11), contentDescription = "element")
            Spacer(modifier = Modifier.height(24.dp))
            Image(painter = painterResource(id = R.drawable.element_12), contentDescription = "element")
        }


        Column(modifier = Modifier
            .padding(12.dp)
            .align(Alignment.TopEnd)

        ) {
            Image(painter = painterResource(id = R.drawable.element_10), contentDescription = "element")
            Spacer(modifier = Modifier.height(24.dp))
            Image(painter = painterResource(id = R.drawable.element_13), contentDescription = "element")
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .padding(bottom = 64.dp)) {


            Image(
                painter = painterResource(id = R.drawable.element_8),
                contentDescription = "Girl",
                modifier = Modifier.align(
                    Alignment.CenterHorizontally
                )
            )

            Box(modifier = Modifier.fillMaxWidth()){
                Image(
                    painter = painterResource(id = R.drawable.element_9),
                    contentDescription = "Scores back",
                    modifier = Modifier.align(Alignment.Center)
                )

                Text(
                    text = "Score is 0",
                    color = Color.White,
                    fontFamily = mainFont,
                    modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }

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
                        items(20){ i ->

                            Box(modifier = Modifier.padding(12.dp)){
                                gameViewModel.liveState.value!![i].let {
                                    it.let { painterResource(id = it.image) }.let { img ->
                                        Image(
                                            painter = img,
                                            contentDescription = "element",
                                            modifier = Modifier.pointerInput(Unit){
                                                detectDragGestures(onDrag = { change, dragAmount ->
                                                    if(dragAmount.x > 25){
                                                        Log.d("123123", "swapR")
                                                        gameViewModel.swapR(i);
                                                    } else if(dragAmount.x < -25){
                                                        Log.d("123123", "swapL")
                                                        gameViewModel.swapL(i)
                                                    } else if(dragAmount.y > 25){
                                                        Log.d("123123", "swapD")
                                                        gameViewModel.swapD(i)
                                                    } else if(dragAmount.y < -25){
                                                        Log.d("123123", "swapU")
                                                        gameViewModel.swapU(i)
                                                    }
                                                })
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}