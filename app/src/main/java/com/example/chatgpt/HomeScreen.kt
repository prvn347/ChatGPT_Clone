package com.example.chatgpt

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatgpt.ui.theme.ChatGPTTheme

@Composable
fun NavigationTopBar() {





}
@Composable
fun homeScreen(modifier: Modifier = Modifier) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp)
            .padding(top = 55.dp), verticalArrangement = Arrangement.SpaceBetween
    ) {

        profileSection()







    }
    Row(modifier.fillMaxWidth()) {
        NavBar()
    }


}


@Composable
fun profileSection(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxWidth()) {

        chatSection(
            profileName = "PRAVIN",
            messageData = "Hi",
            displayPicture = painterResource(id = R.drawable.baseline_person_24)
        )
        chatSection(
            profileName = "CHATGPT",
            messageData = "HI! there,how can I help you this time?",
            displayPicture = painterResource(id = R.drawable.chatgpt)
        )
    }
    bottomTextFeild()
}

@Composable
fun chatSection(
    profileName: String,
    messageData: String, displayPicture: Painter, modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier

            .padding(6.dp), horizontalArrangement = Arrangement.Start
    ) {
        val spacing = 0.5.sp
        val lineheight = 20.sp
        RoundImage(
            image = displayPicture, modifier = Modifier
                .size(40.dp)


        )
        Spacer(modifier = Modifier.width(6.dp))
        Column(modifier = modifier.padding(6.dp), verticalArrangement = Arrangement.Center) {
            Text(text = profileName, fontSize = 7.sp, fontStyle = FontStyle.Italic)
            Text(
                text = messageData,
                fontSize = 16.sp,
                letterSpacing = spacing,
                lineHeight = lineheight
            )

        }

    }

}

@Composable
fun RoundImage(image: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = image, contentDescription = null, modifier = modifier
            .border(width = 2.dp, color = Color.LightGray, shape = CircleShape)
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .padding(2.dp)
            .clip(
                CircleShape
            )
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun bottomTextFeild(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Row(
        modifier = Modifier
            .padding(6.dp)
            .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            modifier = Modifier,
            value = text,
            colors = TextFieldDefaults.textFieldColors(

                cursorColor = Color.Black,
                disabledLabelColor = Color(0xFF0277BD),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            onValueChange = {
                text = it
            },
            shape = RoundedCornerShape(30.dp),
            singleLine = true,
            trailingIcon = {
                if (text != null) {
                    IconButton(onClick = { text = TextFieldValue("") }) {
                        Icon(
                            imageVector = Icons.Outlined.Close,
                            contentDescription = null
                        )
                    }
                }
            }
        )
        Spacer(modifier = Modifier.width(6.dp))
        Button(
            modifier = Modifier
                .padding(8.dp)
                .size(50.dp),
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(0.dp)
        ) {
            Image(imageVector = Icons.Default.Send, contentDescription = "Send")
        }

    }

}
@Preview
@Composable
fun naviagtion() {
    ChatGPTTheme {
        NavigationTopBar()
        homeScreen()

    }
}

