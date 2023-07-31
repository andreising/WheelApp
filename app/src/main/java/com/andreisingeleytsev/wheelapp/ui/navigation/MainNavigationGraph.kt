package com.andreisingeleytsev.wheelapp.ui.navigation

import android.media.MediaPlayer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andreisingeleytsev.wheelapp.ui.screens.main_screen.WheelMainScreen
import com.andreisingeleytsev.wheelapp.ui.screens.rules_screen.RulesScreen
import com.andreisingeleytsev.wheelapp.ui.screens.settings_screen.SettingsScreen
import com.andreisingeleytsev.wheelapp.ui.utils.Routes

@Composable
fun MainNavigationGraph(
    mediaPlayer: MediaPlayer?
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.MAIN_SCREEN) {
        composable(Routes.MAIN_SCREEN) {
            WheelMainScreen(navController)
        }
        composable(Routes.RULES_SCREEN) {
            RulesScreen(navController)
        }
        composable(Routes.SETTINGS_SCREEN) {
            SettingsScreen(navController, mediaPlayer)
        }
    }
}