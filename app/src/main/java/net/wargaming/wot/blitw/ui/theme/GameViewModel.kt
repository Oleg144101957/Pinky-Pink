package net.wargaming.wot.blitw.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import net.wargaming.wot.blitw.R
import net.wargaming.wot.blitw.domain.StateOfElement

class GameViewModel : ViewModel(){

    val liveScore: MutableStateFlow<Int> = MutableStateFlow(0)

    val liveState: MutableStateFlow<List<StateOfElement>> = MutableStateFlow(mutableListOf(
        StateOfElement(0, R.drawable.element_2),
        StateOfElement(1, R.drawable.element_3),
        StateOfElement(2, R.drawable.element_4),
        StateOfElement(3, R.drawable.element_5),
        StateOfElement(4, R.drawable.element_6),
        StateOfElement(5, R.drawable.element_2),
        StateOfElement(6, R.drawable.element_3),
        StateOfElement(7, R.drawable.element_4),
        StateOfElement(8, R.drawable.element_5),
        StateOfElement(9, R.drawable.element_6),
        StateOfElement(10, R.drawable.element_2),
        StateOfElement(11, R.drawable.element_3),
        StateOfElement(12, R.drawable.element_4),
        StateOfElement(13, R.drawable.element_5),
        StateOfElement(14, R.drawable.element_6),
        StateOfElement(15, R.drawable.element_2),
        StateOfElement(16, R.drawable.element_3),
        StateOfElement(17, R.drawable.element_4),
        StateOfElement(18, R.drawable.element_5),
        StateOfElement(19, R.drawable.element_6)
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

    }


    fun increaseScore(){
        liveScore.value += 1
    }



}