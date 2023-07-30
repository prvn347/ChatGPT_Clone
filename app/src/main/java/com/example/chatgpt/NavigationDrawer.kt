package com.example.chatgpt

import android.view.MenuItem
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatgpt.ui.theme.ChatGPTTheme

@Composable
fun DrawerHeader() {

}

@Composable
fun DrawerBody(
    items: List<com.example.chatgpt.MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (com.example.chatgpt.MenuItem) -> Unit
) {
   Column(modifier.width(300.dp).background(Color.White)) {
       Box(
           modifier = Modifier
               .fillMaxWidth()
               .padding(vertical = 64.dp).background(Color(0xFFFFFFFF)),
           contentAlignment = Alignment.Center
       ) {
           Text(text = "ChatGPT Profile", fontSize = 40.sp)
       }
       LazyColumn(
           modifier
               .background(Color(0xFF9EB1E4))
               .fillMaxHeight()) {


           items(items) { item ->

               Row(
                   modifier = Modifier
                       .fillMaxWidth()
                       .clickable {
                           onItemClick(item)
                       }
                       .padding(16.dp)
               ) {
                   Icon(
                       imageVector = item.icon,
                       contentDescription = item.contentDescription
                   )
                   Spacer(modifier = Modifier.width(16.dp))
                   Text(
                       text = item.title,
                       style = itemTextStyle,
                       modifier = Modifier.weight(1f)
                   )
               }
           }
       }
   }
   }


@Preview(showBackground = true)
@Composable
fun jetpack() {
    ChatGPTTheme {

        DrawerHeader()

    }
}