package com.example.myapplication

import android.os.Bundle
import android.view.Display.Mode
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R.string.hello_world_text
import com.example.myapplication.ui.theme.MyApplicationTheme


/*
// -----------------
// -- HELLO WORLD --
// -----------------

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = stringResource(hello_world_text),
                        from = stringResource(R.string.from_text),
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

// Grouped in one row
@Composable
fun GreetingTextRow(message: String, from: String, modifier: Modifier = Modifier){
    Row {
        Text(
            text = message,
            fontSize = 30.sp,
            lineHeight = 116.sp,
        )
        Text(
            text = from,
            fontSize = 36.sp,
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        ) {
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 16.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .padding(end = 16.dp)
                // .align(alignment = Alignment.End)
                .align(alignment = Alignment.CenterHorizontally)
                .background(
                    color = Color.Magenta,
                    shape = MaterialTheme.shapes.small
                )
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box (modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop, // Fill the screen
            alpha = 0.5F // Transparency
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        )
    }
}

// App Preview
@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
        GreetingImage(
            message = stringResource(R.string.hello_world_text),
            from = stringResource(R.string.from_text),
            modifier = Modifier.padding(8.dp)
        )
    }
}
 */


/*
// ---------------------
// -- COMPOSE ARTICLE --
// ---------------------

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle(
                        title = stringResource(R.string.title_text),
                        header = stringResource(R.string.header_text),
                        text = stringResource(R.string.text_text),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}


@Composable
fun ArticleText(title: String, header: String, text: String, modifier: Modifier = Modifier){
    Column (
        modifier = modifier,
        // verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = title,
            fontSize = 32.sp,
            // lineHeight = 80.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = header,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            )
        )
        Text(
            text = text,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun ComposeArticle(title: String, header: String, text: String,  modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column (modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 1.0F
        )
        ArticleText(
            title = title,
            header = header,
            text = text,
            modifier = Modifier
        )
    }
}

// App preview
@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
        ComposeArticle(
            title = stringResource(R.string.title_text),
            header = stringResource(R.string.header_text),
            text = stringResource(R.string.text_text),
            modifier = Modifier
        )
    }
}
*/


/*
// ------------------
// -- TASK MANAGER --
// ------------------

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTask(
                        text1 = stringResource(R.string.task_completed_text),
                        text2 = stringResource(R.string.task_completed_second_text),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}


@Composable
fun TaskText(text1: String, text2: String, modifier: Modifier = Modifier){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text1,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            modifier = Modifier
        )
    }
}

@Composable
fun ComposeTask(text1: String, text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)

    Column (
        modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            // contentScale = ContentScale.Inside,
            // alpha = 1.0F
        )
        TaskText(
            text1 = text1,
            text2 = text2,
            modifier = Modifier
        )

    }
}

// App preview
@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
        ComposeTask(
            text1 = stringResource(R.string.task_completed_text),
            text2 = stringResource(R.string.task_completed_second_text),
            modifier = Modifier.fillMaxSize()
        )
    }
}
*/


/*
// ----------------------
// -- COMPOSE QUADRANT --
// ----------------------

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}


@Composable
fun Quadrant(text1: String, text2: String, color: Color, modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text1,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Composable
fun ComposeQuadrantApp() {
    val text1_1 = stringResource(R.string.q_title1)
    val text1_2 = stringResource(R.string.q_text1)

    val text2_1 = stringResource(R.string.q_title2)
    val text2_2 = stringResource(R.string.q_text2)

    val text3_1 = stringResource(R.string.q_title3)
    val text3_2 = stringResource(R.string.q_text3)

    val text4_1 = stringResource(R.string.q_title4)
    val text4_2 = stringResource(R.string.q_text4)

    Column(Modifier.fillMaxWidth()) {
        Row (Modifier.weight(0.5f)) {
            Quadrant(text1_1, text1_2, Color(0xFFEADDFF), Modifier.weight(1f))
            Quadrant(text2_1, text2_2, Color(0XFFFFFFFF), Modifier.weight(1f))
        }
        Row (Modifier.weight(0.5f)) {
            Quadrant(text3_1, text3_2, Color(0xFFD0BCFF), Modifier.weight(1f))
            Quadrant(text4_1, text4_2, Color(0xFFEADDFF), Modifier.weight(1f))
        }
    }
}

// App preview
@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
        ComposeQuadrantApp()
    }
}
*/


// -----------------------
// -- BUSINESS CARD APP --
// -----------------------

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}


@Composable
fun InfoSubSection(painter: Painter, text: String, modifier : Modifier = Modifier) {
    Row (
        modifier = Modifier.padding(
            top = 13.dp
        ),
        verticalAlignment = Alignment.CenterVertically
        ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.size(25.dp)
        )
        Text(
            text = text,
            fontSize = 16.sp,
            color = Color(0xFFEFEFEF),
            modifier = Modifier.padding(
                start = 10.dp
            )
        )
    }
}

@Composable
fun InfoSection(modifier : Modifier = Modifier) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Bottom) {
        InfoSubSection(
            painter = painterResource(R.drawable.phone_24dp_efefef),
            text = stringResource(R.string.my_phone_number)
        )
        InfoSubSection(
            painter = painterResource(R.drawable.share_24dp_efefef),
            text = stringResource(R.string.my_arroba)
        )
        InfoSubSection(
            painter = painterResource(R.drawable.email_24dp_efefef),
            text = stringResource(R.string.my_email)
        )
    }
}

@Composable
fun MainSection(modifier : Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = painterResource(R.drawable.assignment_ind_24dp_efefef),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
        Text(
            text = stringResource(R.string.my_name),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFEFEFEF),
            modifier = Modifier
                .padding(
                    top = 25.dp
                )
        )
        Text(
            text = stringResource(R.string.my_short_description),
            fontSize = 16.sp,
            color = Color(0xFFEFEFEF),
            // fontWeight = FontWeight.Thin,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}


@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF0A0A0A))
            .padding(
                top = 140.dp,
                bottom = 80.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        MainSection(Modifier)
        InfoSection(Modifier)
    }
}

// App preview
@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
        BusinessCardApp()
    }
}
