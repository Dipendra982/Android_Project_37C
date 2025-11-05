package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.*
import androidx.compose.ui.tooling.preview.Preview

class InstagramProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ProfileScreen() }
    }
}

// Top bar
@Composable
fun InstagramTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 14.dp, horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = "Back",
            tint = Color.Unspecified, // Use Color.Unspecified to show the original PNG colors
            modifier = Modifier.size(23.dp)
        )
        Spacer(modifier = Modifier.width(50.dp))
        Text(
            text = "dipendrakumarsah@22",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.width(4.dp))
        Icon(
            painter = painterResource(id = R.drawable.bluetick),
            contentDescription = "Verified",
            tint = Color.Unspecified,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "Menu",
            tint = Color.Unspecified,
            modifier = Modifier.size(23.dp)
        )
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InstagramTopBar()
        Spacer(modifier = Modifier.height(10.dp))
        // Circular gradient border profile image
        Box(contentAlignment = Alignment.Center) {
            Box(
                modifier = Modifier
                    .size(124.dp)
                    .background(
                        Brush.sweepGradient(
                            listOf(
                                Color(0xFFFCAF45), Color(0xFFBC2A8D),
                                Color(0xFFD2417A), Color(0xFF659AD2)
                            )
                        ), shape = CircleShape
                    )
            )
            Image(
                painter = painterResource(id = R.drawable.pp),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(130.dp)
                    .clip(CircleShape)
                    .border(3.dp, Color.White, CircleShape)
            )
        }
        Spacer(modifier = Modifier.height(18.dp))
        // Stats
        Row(
            Modifier.fillMaxWidth().padding(horizontal = 14.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatItem("98", "Posts")
            StatItem(" 413", "Followers")
            StatItem("256", "Following")
        }
        Spacer(modifier = Modifier.height(18.dp))
        // Bio
        Column(Modifier.fillMaxWidth().padding(horizontal = 28.dp)) {
            Text(
                text = "Dipendra Kumar Sah",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "photographer & director 📸\nrepresented by Anderson Hopkins\nBased in LA",
                fontSize = 16.sp
            )
            Text(
                text = "#SetintheStreet",
                color = Color(0xFF1184e8),
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )
            Text(
                text = "www.justinbettman.com",
                color = Color(0xFF1184e8),
                fontSize = 16.sp,
                style = TextStyle(textDecoration = TextDecoration.Underline)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Followed by millchannelexperience and heatherday",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        Spacer(modifier = Modifier.height(18.dp))
        // Buttons
        Row(
            Modifier.fillMaxWidth().padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3797F0)),
                modifier = Modifier
                    .weight(1f)
                    .height(42.dp),
                shape = RoundedCornerShape(9.dp)
            ) {
                Text("Follow", color = Color.White, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(12.dp))
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEFEFEF)),
                modifier = Modifier
                    .weight(1f)
                    .height(42.dp),
                shape = RoundedCornerShape(9.dp)
            ) {
                Text("Message", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun StatItem(
    value: String,
    label: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, fontWeight = FontWeight.Bold, fontSize = 17.sp)
        Text(text = label, fontSize = 15.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInstagramProfile() {
    ProfileScreen()
}
// Learning git