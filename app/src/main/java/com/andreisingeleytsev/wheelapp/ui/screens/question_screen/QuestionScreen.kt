package com.andreisingeleytsev.wheelapp.ui.screens.question_screen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.andreisingeleytsev.wheelapp.R
import com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen.WhellScreenEvent
import com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen.WhellScreenViewModel
import com.andreisingeleytsev.wheelapp.ui.theme.MainColor
import com.andreisingeleytsev.wheelapp.ui.utils.Fonts

@Composable
fun QuestionScreen(viewModel: WhellScreenViewModel = hiltViewModel()) {
    val context = LocalContext.current.applicationContext
    val sharedPreferences = context.getSharedPreferences("shared_pref", Context.MODE_PRIVATE)
    Column(Modifier.padding(28.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = viewModel.coast.toString(), style = TextStyle(
                fontSize = 64.sp, color = MainColor, fontFamily = Fonts.font
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        Box(modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.question_bg),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = viewModel.question.question, style = TextStyle(
                    fontSize = 24.sp,
                    color = Color.White,
                    fontFamily = Fonts.font,
                    textAlign = TextAlign.Center
                ), modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .wrapContentSize()
                .clickable {
                    viewModel.onEvent(WhellScreenEvent.OnChooseVariant(0))
                    sharedPreferences.edit()?.putInt("money", viewModel.balance.value)?.apply()
                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = viewModel.bgList[0].value),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = viewModel.shuffledList[0], style = TextStyle(
                    fontSize = 32.sp, color = Color.White, fontFamily = Fonts.font,
                    textAlign = TextAlign.Center
                )
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .wrapContentSize()
                .clickable {
                    viewModel.onEvent(WhellScreenEvent.OnChooseVariant(1))
                    sharedPreferences.edit()?.putInt("money", viewModel.balance.value)?.apply()
                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = viewModel.bgList[1].value),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = viewModel.shuffledList[1], style = TextStyle(
                    fontSize = 32.sp, color = Color.White, fontFamily = Fonts.font,
                    textAlign = TextAlign.Center
                )
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .wrapContentSize()
                .clickable {
                    viewModel.onEvent(WhellScreenEvent.OnChooseVariant(2))
                    sharedPreferences.edit()?.putInt("money", viewModel.balance.value)?.apply()
                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = viewModel.bgList[2].value),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = viewModel.shuffledList[2], style = TextStyle(
                    fontSize = 32.sp, color = Color.White, fontFamily = Fonts.font,
                    textAlign = TextAlign.Center
                )
            )
        }

    }
}