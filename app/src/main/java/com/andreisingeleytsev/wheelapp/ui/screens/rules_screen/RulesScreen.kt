package com.andreisingeleytsev.wheelapp.ui.screens.rules_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.andreisingeleytsev.wheelapp.R

@Composable
fun RulesScreen(navHostController: NavHostController) {
    Image(
        painter = painterResource(id = R.drawable.main_bg),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    Column(Modifier.padding(26.dp).fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.rules_screen),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
    Box(modifier = Modifier.padding(start = 15.dp, top = 15.dp).fillMaxSize(), contentAlignment = Alignment.TopStart) {
        Image(
            painter = painterResource(id = R.drawable.btn_back),
            contentDescription = null,
            modifier = Modifier.size(50.dp).clickable {
                navHostController.popBackStack()
            }
        )
    }
}