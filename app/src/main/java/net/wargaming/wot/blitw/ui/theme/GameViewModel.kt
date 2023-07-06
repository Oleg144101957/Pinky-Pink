package net.wargaming.wot.blitw.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import net.wargaming.wot.blitw.R
import net.wargaming.wot.blitw.domain.StateOfElement

class GameViewModel : ViewModel(){

    val liveScore: MutableStateFlow<Int> = MutableStateFlow(0)
    val liveWin: MutableStateFlow<Boolean> = MutableStateFlow(false)

    val liveState: MutableStateFlow<List<StateOfElement>> = MutableStateFlow(mutableListOf(
        StateOfElement(0, R.drawable.element_3),
        StateOfElement(1, R.drawable.element_2),
        StateOfElement(2, R.drawable.element_5),
        StateOfElement(3, R.drawable.element_4),

        StateOfElement(4, R.drawable.element_4),
        StateOfElement(5, R.drawable.element_5),
        StateOfElement(6, R.drawable.element_3),
        StateOfElement(7, R.drawable.element_2),

        StateOfElement(8, R.drawable.element_5),
        StateOfElement(9, R.drawable.element_3),
        StateOfElement(10, R.drawable.element_4),
        StateOfElement(11, R.drawable.element_2),

        StateOfElement(12, R.drawable.element_3),
        StateOfElement(13, R.drawable.element_2),
        StateOfElement(14, R.drawable.element_5),
        StateOfElement(15, R.drawable.element_4),

        StateOfElement(16, R.drawable.element_5),
        StateOfElement(17, R.drawable.element_4),
        StateOfElement(18, R.drawable.element_3),
        StateOfElement(19, R.drawable.element_2)
    ))


    fun swapL(elementN: Int){
        val elementToSwap = elementN-1
        swap(elementN, elementToSwap)
    }

    fun swapR(elementN: Int){
        val elementToSwap = elementN+1
        swap(elementN, elementToSwap)
    }

    private fun swap(currentElement: Int, elementToSwap: Int){
        val imageToSwap = liveState.value!![elementToSwap].image
        val currentImage = liveState.value!![currentElement].image
        val newList = liveState.value!!.map {elementState ->
            if (elementState.id == currentElement){
                elementState.copy(image = imageToSwap)
            } else if (elementState.id == elementToSwap){
                elementState.copy(image = currentImage)
            } else {
                elementState
            }
        }

        viewModelScope.launch {
            delay(400)
            liveState.emit(newList)
            checkWin()
        }
    }

    private fun checkWin(){


        val column1 = listOf<Int>(
            liveState.value[0].image,
            liveState.value[4].image,
            liveState.value[8].image,
            liveState.value[12].image,
            liveState.value[16].image
        )

        val column2 = listOf<Int>(
            liveState.value[1].image,
            liveState.value[5].image,
            liveState.value[9].image,
            liveState.value[13].image,
            liveState.value[17].image
        )

        val column3 = listOf<Int>(
            liveState.value[2].image,
            liveState.value[6].image,
            liveState.value[10].image,
            liveState.value[14].image,
            liveState.value[18].image
        )

        val column4 = listOf<Int>(
            liveState.value[3].image,
            liveState.value[7].image,
            liveState.value[11].image,
            liveState.value[15].image,
            liveState.value[19].image
        )

        val allElementsSame1 = column1.all { it == column1[0] }
        val allElementsSame2 = column2.all { it == column2[0] }
        val allElementsSame3 = column3.all { it == column3[0] }
        val allElementsSame4 = column4.all { it == column4[0] }

        val allAreTrue = allElementsSame1 && allElementsSame2 && allElementsSame3 && allElementsSame4

        Log.d("123123", "checkWin allAreTrue is $allAreTrue allElementsSame1 is $allElementsSame1 allElementsSame2 is $allElementsSame2 allElementsSame3 is $allElementsSame3 allElementsSame4 is $allElementsSame4")
        Log.d("123123", "The column1 is $column1")
        Log.d("123123", "The column2 is $column2")
        Log.d("123123", "The column3 is $column3")
        Log.d("123123", "The column4 is $column4")

        if (allAreTrue){

            val scope = MainScope()
            scope.launch {
                delay(300)
                liveWin.value = true
            }
        }

    }


    fun increaseScore(){
        liveScore.value += 1
    }



}