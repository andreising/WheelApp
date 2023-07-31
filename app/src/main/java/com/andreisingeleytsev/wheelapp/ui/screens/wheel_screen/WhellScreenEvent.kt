package com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen

sealed class WhellScreenEvent{
    object OnRoll: WhellScreenEvent()
    data class OnChooseVariant(val index: Int): WhellScreenEvent()
}
