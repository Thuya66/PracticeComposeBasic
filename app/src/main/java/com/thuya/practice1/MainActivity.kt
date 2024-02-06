package com.thuya.practice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thuya.practice1.ui.theme.Practice1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tutorial(
                        title= stringResource(R.string.tutorial_title),
                        header = stringResource(R.string.tutorial_header),
                        body = stringResource(R.string.tutorial_body)
                    )
                }
            }
        }
    }
}

@Composable
fun Tutorial( title: String, header:String, body: String) {
    val img = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = img,
            contentDescription = "Tutorial BG"
        )
        Column (){
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier.padding(PaddingValues(16.dp))
            )
            Text(
                text = header,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(PaddingValues(16.dp,0.dp))
            )
            Text(
                text = body,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(PaddingValues(16.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {
    Practice1Theme {
        Tutorial(
            title= stringResource(R.string.tutorial_title),
            header = stringResource(R.string.tutorial_header),
            body = stringResource(R.string.tutorial_body)
        )
    }
}