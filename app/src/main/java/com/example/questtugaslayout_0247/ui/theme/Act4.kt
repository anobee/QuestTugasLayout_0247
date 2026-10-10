package com.example.questtugaslayout_0247.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

private data class Student(
    val name: String,
    val phone: String,
    val address: String,
    val cardColor: Int,
    val nameColor: Int,
    val phoneColor: Int,
    val addressColor: Int,
    val italicName: Boolean = false
)

@Composable
fun Act4(modifier: Modifier = Modifier) {
    val names = stringArrayResource(R.array.student_names)
    val phones = stringArrayResource(R.array.student_phones)
    val addresses = stringArrayResource(R.array.student_addresses)

    val students = listOf(
        Student(
            names[0], phones[0], addresses[0],
            R.color.card_gray, R.color.white,
            R.color.cyan, R.color.yellow, true
        ),
        Student(
            names[1], phones[1], addresses[1],
            R.color.card_purple, R.color.white,
            R.color.cyan, R.color.yellow
        ),
        Student(
            names[2], phones[2], addresses[2],
            R.color.card_blue, R.color.white,
            R.color.cyan, R.color.white
        ),
        Student(
            names[3], phones[3], addresses[3],
            R.color.card_green, R.color.white,
            R.color.cyan, R.color.white
        )
    )
