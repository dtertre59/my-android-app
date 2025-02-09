package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                LemonadeApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    MyApplicationTheme {
        Screen(
            name = stringResource(R.string.app_name),
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = MaterialTheme.colorScheme.background
                )
        )
    }
}


@Composable
fun Screen(name: String, modifier: Modifier = Modifier) {

    val state = remember { mutableStateOf(1) }
    val lemonAttempts = remember { mutableStateOf(0) }

    val imageResource = when (state.value) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }

    val imageDescriptionResource = when (state.value) {
        1 -> R.string.lemon_tree_description
        2 -> R.string.lemon_description
        3 -> R.string.glass_of_lemonade_description
        else -> R.string.empty_glass_description
    }

    val imageDescription = stringResource(imageDescriptionResource)

    Column (
        modifier = modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(name, modifier)

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1 MODE
//            Image(
//                painter = painterResource(imageResource),
//                contentDescription = imageDescription,
//                modifier = Modifier
//                    .size(200.dp)
//                    .background(
//                        color = Color(0xFFC3ECD2),
//                        shape = MaterialTheme.shapes.extraLarge)
//                    .clickable (
//                        onClick = { state.value = lemonOnClick(state.value) }
//                    )
//            )

            // 2 MODE
            Button (
                onClick = {
                    if (state.value == 2 && lemonAttempts.value > 0) {
                        lemonAttempts.value--
                    } else {
                        if (lemonAttempts.value == 0) {
                            lemonAttempts.value = (2..4).random()
                        }
                        state.value = lemonOnClick(state.value)
                    }
                },
                modifier = Modifier
                    .width(dimensionResource(R.dimen.button_image_width))
                    .height(dimensionResource(R.dimen.button_image_height))
                    .padding(dimensionResource(R.dimen.button_interior_padding)),
                shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius )),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFC3ECD2)  // MaterialTheme.colorScheme.primaryContainer
                ),
                contentPadding = PaddingValues(0.dp)
            ) {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = imageDescription,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }

            Spacer (
                modifier = Modifier.height(50.dp)
            )
            Text(
                text = imageDescription,
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
//                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier
            )
        }
    }
}


@Composable
fun Header(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFF5D36C))
            .padding(
                top = 16.dp,
                bottom = 16.dp
            )
    )
}

@Composable
fun WelcomeScreen(name: String, modifier: Modifier = Modifier) {
    /* TODO*/
}

fun lemonOnClick(state: Int): Int {
    val newState = if (state == 4) {1} else {state + 1}
//    if (newState == 3) {
//        val random = (2..3).random()
//        return random
//    }
    return newState
}

