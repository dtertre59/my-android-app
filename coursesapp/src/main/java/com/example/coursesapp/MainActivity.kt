package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.model.Topic
import com.example.coursesapp.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesApp()
        }
    }
}

@Composable
fun CoursesApp(modifier: Modifier = Modifier) {
    MyApplicationTheme {
//        TopicCard(Topic(R.string.architecture, 58, R.drawable.architecture))
//        CardsGrid(topics = DataSource.topics, modifier = Modifier)
        TopicGrid(modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun CoursesAppPreview() {
    MyApplicationTheme {
//        TopicCard(Topic(R.string.architecture, 58, R.drawable.architecture))
//        CardsGrid(topics = DataSource.topics, modifier = Modifier)
        TopicGrid(modifier = Modifier)
    }
}

@Composable
fun TopicGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.padding(8.dp)
    ) {
        items(DataSource.topics) { topic ->
            TopicCard(topic)
        }
    }
}


@Composable
fun CardsGrid(topics: List<Topic>,modifier: Modifier) {
    Row {
        LazyColumn {
            items(topics.size / 2) { index ->
                TopicCard(topic = topics[index],
                    modifier = Modifier.padding(8.dp))
            }
        }
        LazyColumn {
            items(topics.size / 2) { index ->
                TopicCard(topic = topics[index + topics.size / 2],
                modifier = Modifier.padding(8.dp))
            }
        }
    }
}


@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card {
        Row {
            Box{
                Image(
                    painter = painterResource(id = topic.imageResourceId),
                    contentDescription = stringResource(id = topic.name),
                    modifier = Modifier.size(68.dp, 68.dp)
                )
            }

            Column (
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .padding(top = 16.dp, end = 16.dp, start = 16.dp)) {
                Text(
                    text = stringResource(id = topic.name),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.padding(bottom = 8.dp))
                Row (verticalAlignment = Alignment.CenterVertically,) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                    Text(
                        text = topic.availableCourses.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier.padding(start = 8.dp)                    )

                }
            }
        }
    }




}
