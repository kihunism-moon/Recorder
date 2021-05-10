package com.example.recorder

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatImageButton

//ImageButton 은  AppCompat을 상속 받아야 함 -> AppCompatImageButton 으로 사용!

class RecordButton(context: Context, attrs: AttributeSet): AppCompatImageButton(context, attrs) {
        fun updateIconWithState(state: State) {
            when(state) {
                State.BEFORE_RECORDING -> {
                    setImageResource(R.drawable.ic_record)
                }
                State.ON_RECORDING -> {
                    setImageResource(R.drawable.ic_stop)
                }
                State.AFTER_RECOREDING -> {
                    setImageResource(R.drawable.ic_play)
                }
                State.ON_PLAYING -> {
                    setImageResource(R.drawable.ic_stop)
                }
            }
        }




}