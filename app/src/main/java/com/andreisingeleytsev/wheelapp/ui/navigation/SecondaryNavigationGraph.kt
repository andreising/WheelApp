package com.andreisingeleytsev.wheelapp.ui.navigation


import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andreisingeleytsev.wheelapp.ui.screens.main_screen.WheelMainScreen
import com.andreisingeleytsev.wheelapp.ui.screens.start_screen.StartScreen
import com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen.WheelScreen
import com.andreisingeleytsev.wheelapp.ui.utils.Routes


@Composable
fun SecondaryNavigationGraph(
    balance: MutableState<Int>, isStart: MutableState<Boolean>
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.START_SCREEN) {
        composable(Routes.START_SCREEN) {
            isStart.value = true
            StartScreen(navController)
        }
        composable(Routes.WHELL_SCREEN) {
            isStart.value = false
            WheelScreen(balance)
        }
    }
}
