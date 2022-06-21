package com.example.kamaltdinovglava1
import androidx.annotation.StringRes
data class Question(@StringRes val textResId: Int, val answer: Boolean)
private val questionBank = listOf(
    Question(R.string.question_australia, true),
    Question(R.string.question_oceans, true),
    Question(R.string.question_mideast, false),
    Question(R.string.question_africa, false),
    Question(R.string.question_americas,true),
    Question(R.string.question_asia, true))
private var currentIndex = 0