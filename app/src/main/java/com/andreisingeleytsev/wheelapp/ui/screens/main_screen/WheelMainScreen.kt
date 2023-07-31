package com.andreisingeleytsev.wheelapp.ui.screens.main_screen

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.andreisingeleytsev.wheelapp.ui.navigation.MainNavigationGraph
import com.andreisingeleytsev.wheelapp.ui.navigation.SecondaryNavigationGraph
import com.andreisingeleytsev.wheelapp.ui.screens.start_screen.StartScreen
import com.andreisingeleytsev.wheelapp.ui.top_bar.TopBar
import kotlin.math.absoluteValue

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WheelMainScreen(navController: NavHostController) {
    val context = LocalContext.current.applicationContext
    val sharedPreferences = context.getSharedPreferences("shared_pref", Context.MODE_PRIVATE)
    val isStart = remember{
        mutableStateOf(true)
    }
    val balance = remember {
        mutableStateOf(sharedPreferences?.getInt("money", 1000)!!)
    }
    Scaffold( topBar = {
        TopBar(navController, balance.value, isStart.value)
    }) {
        Box(modifier = Modifier
            .fillMaxSize()){
            Box(modifier = Modifier
                .fillMaxSize(), contentAlignment = Alignment.Center) {
                SecondaryNavigationGraph(balance, isStart)
            }
        }
    }

}