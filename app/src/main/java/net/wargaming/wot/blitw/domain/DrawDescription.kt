package net.wargaming.wot.blitw.domain

import android.util.Log

class DrawDescription(val mode: String) {

    fun initDraw(){
        val length = mode.length
        Log.d("Pink Game", "Length $length")
    }
}