package com.thuya.practice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thuya.practice1.ui.theme.Practice1Theme

class Quadrant : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantList()
                }
            }
        }
    }
}

@Composable
fun QuadrantList(){
    Column (
        Modifier.fillMaxWidth()
    ){
        Row(
            Modifier.weight(1f)
        ) {
            QuadrantView(
                firstString = stringResource(R.string.first1String),
                secondString = stringResource(R.string.second1String),
                modifier = Modifier.background(
                    colorResource(R.color.firstColor)
                ).weight(1f)
            )
            QuadrantView(
                firstString = stringResource(R.string.first2String),
                secondString = stringResource(R.string.second2String),
                modifier = Modifier.background(
                    colorResource(R.color.secondColor)
                ).weight(1f)
            )
        }
        Row(
            Modifier.weight(1f)
        ) {
            QuadrantView(
                firstString = stringResource(R.string.first3String),
                secondString = stringResource(R.string.second3String),
                modifier = Modifier.background(
                    colorResource(R.color.thirdColor)
                ).weight(1f)
            )
            QuadrantView(
                firstString = stringResource(R.string.first4String),
                secondString = stringResource(R.string.second4String),
                modifier = Modifier.background(
                    colorResource(R.color.fourthColor)
                ).weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantView(firstString: String, secondString: String, modifier: Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(PaddingValues(16.dp))
    ) {
        Text(
            text = firstString,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(PaddingValues(0.dp, 0.dp, 0.dp, 16.dp))
        )
        Text(
            text = secondString,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    Practice1Theme {
        QuadrantList()
    }
}