import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import nick.mirosh.inspirational.balls

@Composable
fun App() {
    MaterialTheme {
        QuotePager()
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun QuotePager() {
    val quotes = listOf(
        balls(),
        "Compose makes it easy to build beautiful UI",
        "Declarative in nature",
        "Stateless",
        "Composable",
        "Learn once, apply everywhere"
    )
    val pagerState = rememberPagerState(pageCount = {
        10
    })
    VerticalPager(state = pagerState) { page ->

        Box(
            modifier = Modifier.fillMaxSize()

        ) {
            Text(
                text = quotes[page],
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}