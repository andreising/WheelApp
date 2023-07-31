package com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen

import android.os.CountDownTimer
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andreisingeleytsev.wheelapp.R
import com.andreisingeleytsev.wheelapp.ui.utils.UIEvent
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class WhellScreenViewModel: ViewModel() {
    private val _uiEvent = Channel<UIEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    private fun sendUIEvent(event: UIEvent){
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

    fun onEvent(event: WhellScreenEvent){
        when(event) {
            is WhellScreenEvent.OnChooseVariant -> {
                if (!isClicked) {
                    isClicked = true
                    if (shuffledList[event.index] == question.answers[0]) {
                        bgList[event.index].value = R.drawable.right_bg
                        balance.value = balance.value+coast
                    } else {
                        bgList[event.index].value = R.drawable.false_answer
                        balance.value = balance.value-coast
                    }
                    object : CountDownTimer(2000, 2000) {
                        override fun onTick(p0: Long) {

                        }

                        override fun onFinish() {
                            bgList[event.index].value = R.drawable.answer_bg
                            isWhell.value = true
                            isClicked = false
                        }
                    }.start()
                }

            }
            is WhellScreenEvent.OnRoll -> {
                if (!isRoll) {
                    isRoll = true
                    val newAngle = (1080..1440).random()
                    Log.d("tag", " $newAngle  ${newAngle.toFloat()}")
                    rotation.value = rotation.value+newAngle.toFloat()
                    when(newAngle-1080) {
                        in 0..45 -> {
                            coast = 25
                            question = ListOfQuestions.Angle45.array.random()
                        }
                        in 46..90 -> {
                            coast = 45
                            question = ListOfQuestions.Angle90.array.random()
                        }
                        in 91..135 -> {
                            coast = 75
                            question = ListOfQuestions.Angle135.array.random()
                        }
                        in 136..180 -> {
                            coast = 100
                            question = ListOfQuestions.Angle180.array.random()
                        }
                        in 181..225 -> {
                            coast = 125
                            question = ListOfQuestions.Angle225.array.random()
                        }
                        in 226..270 -> {
                            coast = 200
                            question = ListOfQuestions.Angle270.array.random()
                        }
                        in 271..315 -> {
                            coast = 450
                            question = ListOfQuestions.Angle315.array.random()
                        }
                        in 316..360 -> {
                            coast = 750
                            question = ListOfQuestions.Angle360.array.random()
                        }
                    }
                    shuffledList = question.answers.shuffled()
                    title.value = question.question
                    answer1.value = shuffledList[1]
                    answer2.value = shuffledList[2]
                    answer3.value = shuffledList[3]
                    timerRoll.start()
                }
            }
        }
    }
    private val timerRoll = object : CountDownTimer(5000, 5000) {
        override fun onTick(p0: Long) {

        }

        override fun onFinish() {
            isWhell.value = false
            isRoll = false
            rotation.value = -90F
        }
    }
    private var isClicked = false
    val isWhell = mutableStateOf(true)
    val rotation = mutableStateOf(-90f)
    var isRoll = false
    var balance = mutableStateOf(0)
    var coast = 45
    var question = QuestionItem(
        "What is the name of the cycling race that covers the entire circumference of the Earth's equator?",
        listOf(
            "The Global Bicycle Race", "Around the World by Bicycle", "The Long Ride Home", "The Great Cycle Challenge"
        )
    )
    var shuffledList = emptyList<String>()
    val title = mutableStateOf("")
    val answer1 = mutableStateOf("")
    val answer2 = mutableStateOf("")
    val answer3 = mutableStateOf("")
    val bgList = listOf(
        mutableStateOf(
            R.drawable.answer_bg
        ),
        mutableStateOf(
            R.drawable.answer_bg
        ),
        mutableStateOf(
            R.drawable.answer_bg
        )
    )
}