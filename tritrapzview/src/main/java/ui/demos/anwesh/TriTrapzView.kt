package ui.demos.anwesh

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Path
import android.graphics.RectF

val parts : Int = 3
val scGap : Float = 0.02f
val strokeFactor : Float = 90f
val sizeFactor : Float = 4.6f
val delay : Long = 20
val colors : Array<Int> = arrayOf(
    "#F44336",
    "#673AB7",
    "#4CAF50",
    "#2196F3",
    "#FF9800"
).map {
    Color.parseColor(it)
}.toTypedArray()
val backColor : Int = Color.parseColor("#BDBDBD")

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
