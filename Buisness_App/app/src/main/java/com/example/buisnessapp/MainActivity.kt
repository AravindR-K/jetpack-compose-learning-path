package com.example.buisnessapp

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnessapp.ui.theme.BuisnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeDisplayScreen()
                }
            }
        }
    }
}

@Composable
fun ComposeDisplayScreen() {
    ArticleCard (
        name = stringResource(R.string.name),
        occupation = stringResource(R.string.occupation),
        phoneNo = stringResource(R.string.phoneNumber),
        share = stringResource(R.string.share),
        email = stringResource(R.string.email),
        logo = painterResource(R.drawable.android_logo)
    )
}
@Composable
private fun ArticleCard(
    name : String,
    occupation : String,
    phoneNo : String,
    share : String,
    email : String,
    logo : Painter,
    modifier : Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .padding(top=100.dp, start=20.dp, end=20.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(top=80.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = logo,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start=120.dp, end=120.dp, top=55.dp, bottom=15.dp)
                        .background(Color(0xFF083A4C))
                )
                Text(
                    text = name,
                    textAlign = TextAlign.Center,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = 0.5.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()


                )
                Text(
                    text = occupation,
                    fontSize = 17.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B5E20),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(top=100.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Call,
                        contentDescription = null,
                        tint = Color(0xFF1B5E20),
                        modifier = Modifier
                    )
                    Text (
                        text = stringResource(R.string.phoneNumber),
                        fontSize = 17.sp,
                        modifier = Modifier
                            .padding(start=16.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = null,
                        tint = Color(0xFF1B5E20),
                        modifier = Modifier
                            .padding(end=20.dp)

                    )
                    Text (
                        text = stringResource(R.string.share),
                        fontSize = 17.sp,
                        modifier = Modifier
                            .padding(end=70.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        tint = Color(0xFF1B5E20),
                        modifier = Modifier
                            .padding(end=20.dp)
                    )
                    Text (
                        text = stringResource(R.string.email),
                        fontSize = 17.sp,
                        modifier = Modifier
                            .padding(end=0.dp)
                    )
                }
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuisnessAppTheme {
        ComposeDisplayScreen()
    }
}