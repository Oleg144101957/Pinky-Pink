package net.wargaming.wot.blitw.ui.theme

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.wargaming.wot.blitw.R
import net.wargaming.wot.blitw.domain.StateOfElement

class GameViewModel : ViewModel(){

    val liveState: MutableLiveData<List<StateOfElement>> = MutableLiveData(listOf(
        StateOfElement(R.drawable.element_2),
        StateOfElement(R.drawable.element_3),
        StateOfElement(R.drawable.element_4),
        StateOfElement(R.drawable.element_5),
        StateOfElement(R.drawable.element_6),
        StateOfElement(R.drawable.element_2),
        StateOfElement(R.drawable.element_3),
        StateOfElement(R.drawable.element_4),
        StateOfElement(R.drawable.element_5),
        StateOfElement(R.drawable.element_6),
        StateOfElement(R.drawable.element_2),
        StateOfElement(R.drawable.element_3),
        StateOfElement(R.drawable.element_4),
        StateOfElement(R.drawable.element_5),
        StateOfElement(R.drawable.element_6),
        StateOfElement(R.drawable.element_2),
        StateOfElement(R.drawable.element_3),
        StateOfElement(R.drawable.element_4),
        StateOfElement(R.drawable.element_5),
        StateOfElement(R.drawable.element_6)
    ))


    fun swapL(elemntN: Int){

    }

    fun swapR(elemntN: Int){

    }

    fun swapD(elemntN: Int){

    }

    fun swapU(elemntN: Int){

    }



}