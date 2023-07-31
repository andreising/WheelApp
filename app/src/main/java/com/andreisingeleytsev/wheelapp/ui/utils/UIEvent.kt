package com.andreisingeleytsev.wheelapp.ui.utils

sealed class UIEvent{
    object PopBackStack: UIEvent()
    data class Navigate(val route: String): UIEvent()
    data class NavigateMain(val route: String): UIEvent()
}
