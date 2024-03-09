package com.lkjgc.objectsense.Helper

class Windows {

    fun pttopx(pt: Int): Double{
        return (pt / 0.75)
    }

    fun pxtopt(px:Int): Double {
        return (px * 0.75)
    }
}