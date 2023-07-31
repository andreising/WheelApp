package com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.andreisingeleytsev.wheelapp.R
import com.andreisingeleytsev.wheelapp.ui.screens.question_screen.QuestionScreen

@Composable
fun WheelScreen(balance: MutableState<Int>, viewModel: WhellScreenViewModel = hiltViewModel()) {
    viewModel.balance = balance
    val angle: Float by animateFloatAsState(
        targetValue = viewModel.rotation.value,
        animationSpec = tween(
            durationMillis = 4000
        )
    )
    Image(
        painter = painterResource(id = R.drawable.main_bg),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    if (viewModel.isWhell.value) Column(modifier = Modifier
        .padding(38.dp)
        .fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.rotate_title),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(15.dp))
        Box(contentAlignment = Alignment.TopCenter) {
            Image(
                painter = painterResource(id = R.drawable.whell),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .rotate(angle),
                contentScale = ContentScale.FillWidth
            )
            Image(
                painter = painterResource(id = R.drawable.indicator),
                contentDescription = null,
                modifier = Modifier.width(35.dp),
                contentScale = ContentScale.FillWidth
            )
        }
        Spacer(modifier = Modifier.height(35.dp))
        Image(
            painter = painterResource(id = R.drawable.btn_spin),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    viewModel.onEvent(WhellScreenEvent.OnRoll)
                },
            contentScale = ContentScale.FillWidth
        )
    } else {
        QuestionScreen()
    }
}