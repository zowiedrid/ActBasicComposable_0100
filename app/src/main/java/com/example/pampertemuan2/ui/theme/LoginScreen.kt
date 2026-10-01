package com.example.pampertemuan2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pampertemuan2.R

/**
 * Login screen implementation for Activity 2.
 */
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_bg),
            contentDescription = "Login Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth(0.88f)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Login", fontSize = 27.sp, fontWeight = FontWeight.Bold, color = Color(0xFF3F51B5))
            Text(text = "Ini adalah halaman login,", fontSize = 12.sp, color = Color.DarkGray)
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.umy_logo), contentDescription = "Logo UMY", modifier = Modifier.size(70.dp).clip(CircleShape).background(Color.White), contentScale = ContentScale.Fit)
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Ilham Fadhilah", fontSize = 13.sp, color = Color.DarkGray, fontWeight = FontWeight.Medium)
            Text(text = "Teknologi Informasi", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF3F51B5))
            Text(text = "20200140100", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.size(160.dp).clip(CircleShape).background(Color.LightGray), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(id = R.drawable.kotlin_logo), contentDescription = "Kotlin Logo", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    Pampertemuan2Theme { LoginScreen() }
}
