package com.andreisingeleytsev.wheelapp.ui.screens.settings_screen

import android.media.MediaPlayer
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.andreisingeleytsev.wheelapp.R
import com.andreisingeleytsev.wheelapp.ui.theme.MainColor
import com.andreisingeleytsev.wheelapp.ui.utils.Fonts

@Composable
fun SettingsScreen(navHostController: NavHostController, mediaPlayer: MediaPlayer?) {
    val sound = remember {
        mutableStateOf(mediaPlayer?.isPlaying ?: false)
    }
    val context = LocalContext.current
    val mP = MediaPlayer.create(context, R.raw.music)
    Image(
        painter = painterResource(id = R.drawable.main_bg),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    Column(
        Modifier
            .padding(40.dp)
            .fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "SETTINGS", style = TextStyle(
                fontSize = 64.sp, color = MainColor, fontFamily = Fonts.font
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "SOUND", style = TextStyle(
                fontSize = 34.sp, color = MainColor, fontFamily = Fonts.font
            )
        )
        Switch(
            checked = sound.value, onCheckedChange = {
                sound.value = !sound.value
                if (sound.value) {
                    mediaPlayer!!.start()
//                    mP?.start()
//                    mP?.isLooping = true
                } else {
                    mediaPlayer?.pause()
//                    mP?.stop()
                }
            }, colors = SwitchDefaults.colors(
                uncheckedTrackColor = Color.White,
                checkedTrackColor = Color.Black,
                uncheckedThumbColor = Color.Yellow,
                checkedThumbColor = Color.Yellow
            )
        )
    }
    Box(modifier = Modifier
        .padding(start = 15.dp, top = 15.dp)
        .fillMaxSize(), contentAlignment = Alignment.TopStart) {
        Image(
            painter = painterResource(id = R.drawable.btn_back),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clickable {
                    navHostController.popBackStack()
                }
        )
    }
}