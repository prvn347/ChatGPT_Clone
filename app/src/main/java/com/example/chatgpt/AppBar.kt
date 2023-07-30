package com.example.chatgpt

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatgpt.ui.theme.ChatGPTTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    onNavigationIconClick: () -> Unit
){

    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        modifier = Modifier.background(Color(0xFF0277BD)) ,
        colors = TopAppBarDefaults.mediumTopAppBarColors(),
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Toggle drawer"
                )

            }
        }


    )

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 19.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "newpage")
        Spacer(modifier = Modifier.width(20.dp))
        Icon(imageVector = Icons.Default.MoreVert, contentDescription ="info" , modifier = Modifier.padding(end = 10.dp))
        
    }
}


@Preview
@Composable
fun appbar() {
    ChatGPTTheme {
        AppBar {

        }

    }
}