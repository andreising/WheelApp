package com.andreisingeleytsev.wheelapp.ui.top_bar

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.andreisingeleytsev.wheelapp.MainActivity
import com.andreisingeleytsev.wheelapp.R
import com.andreisingeleytsev.wheelapp.ui.theme.MainColor
import com.andreisingeleytsev.wheelapp.ui.utils.Fonts
import com.andreisingeleytsev.wheelapp.ui.utils.Routes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navHostController: NavHostController, balance: Int, isStart: Boolean) {

    val context = LocalContext.current as? Activity


    TopAppBar(title = {

    }, actions = {
        Row {
            Icon(
                painter = painterResource(id = R.drawable.settings_icon),
                contentDescription = null,
                tint = MainColor,
                modifier = Modifier.clickable {
                    navHostController.navigate(Routes.SETTINGS_SCREEN)
                }
            )
            Spacer(modifier = Modifier.width(15.dp))
            Icon(
                painter = painterResource(id = R.drawable.info_icon),
                contentDescription = null,
                tint = MainColor,
                modifier = Modifier.clickable {
                    navHostController.navigate(Routes.RULES_SCREEN)
                }
            )
        }

    }, navigationIcon = {
        if (!isStart) Box(modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.money_bg), contentDescription = null)
            Text(
                text = balance.toString(), style = TextStyle(
                    fontSize = 23.sp, color = Color.White, fontFamily = Fonts.font,
                    textAlign = TextAlign.Center
                ), modifier = Modifier.padding(start = 25.dp)
            )
        }
    }, colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = Color.Transparent
    )
    )
}