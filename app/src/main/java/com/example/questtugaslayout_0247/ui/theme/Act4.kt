package com.example.questtugaslayout_0247.ui.theme

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource

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

    Surface(
        modifier = modifier.fillMaxSize(),
        color = colorResource(R.color.screen_background)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 20.dp,
                    vertical = 16.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(85.dp))

            Text(
                text = stringResource(R.string.faculty_title),
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.title_text)
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(R.string.university_name),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.title_text)
            )

            Spacer(modifier = Modifier.height(28.dp))

            students.forEach { student ->
                StudentCard(student = student)

                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = stringResource(
                    R.string.copyright,
                    Calendar.getInstance().get(Calendar.YEAR)
                ),
                fontSize = 12.sp,
                color = colorResource(R.color.title_text),
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}

@Composable
private fun StudentCard(student: Student) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(106.dp),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(student.cardColor)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 14.dp,
                    vertical = 10.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(
                    R.string.logo_description
                ),
                modifier = Modifier.size(64.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = student.name,
                    fontSize = 20.sp,
                    fontWeight = if (student.italicName) {
                        FontWeight.Normal
                    } else {
                        FontWeight.Bold
                    },
                    fontStyle = if (student.italicName) {
                        FontStyle.Italic
                    } else {
                        FontStyle.Normal
                    },
                    fontFamily = if (student.italicName) {
                        FontFamily.Cursive
                    } else {
                        FontFamily.Default
                    },
                    color = colorResource(student.nameColor),
                    maxLines = 1
                )

