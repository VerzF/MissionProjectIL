package com.allen.missionprojectil.ui.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.allen.missionprojectil.R

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        UserProfile(
            name = "Allendra Donny Irawan",
            email = "allendradonnyb@gmail.com",
            universitas = "Universitas Pembangunan Nasional Veteran Jawa Timur",
            jurusan = "Sistem Informasi",
            modifier = Modifier
                .padding(16.dp)
                .clickable {}
        )
    }
}

@Composable
fun UserProfile(
    name: String,
    email: String,
    universitas: String,
    jurusan: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = "about_page",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.ExtraBold
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = email,
            style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = universitas,
            style = MaterialTheme.typography.titleSmall)

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = jurusan,
            style = MaterialTheme.typography.titleSmall)
    }
}

@Composable
@Preview(showBackground = true, device = Devices.PIXEL_4)
fun ProfileScreenPreview() {
    ProfileScreen()
}