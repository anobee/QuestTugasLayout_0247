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
