package com.andreisingeleytsev.wheelapp.ui.screens.start_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.andreisingeleytsev.wheelapp.R
import com.andreisingeleytsev.wheelapp.ui.utils.Routes

@Composable
fun StartScreen(navController: NavHostController) {
    Image(
        painter = painterResource(id = R.drawable.start_bg),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.btn_start),
            contentDescription = null,
            modifier = Modifier.width(240.dp)
                .clickable {
                    navController.navigate(Routes.WHELL_SCREEN)
                }
        )
    }
}