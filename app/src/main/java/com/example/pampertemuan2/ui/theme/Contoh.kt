package com.example.pampertemuan2.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import com.example.pampertemuan2.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContohColumn(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.padding(top = 60.dp, start = 60.dp)
    ) {
        Text(text = "Ini adalah teks pertama di dalam Column")
        Text(text = "Ini adalah teks kedua di dalam Column")
    }
}

@Composable
fun ContohRow(modifier: Modifier = Modifier){
    val kota = stringResource(id = R.string.kota)
    Row(
        modifier = modifier.padding(top = 60.dp, start = 60.dp)
    ) {
        Text(text = "Ini adalah teks pertama di dalam Row")
        Text(text = kota)
    }
}

@Preview(showBackground = true)
@Composable
fun ContohColumnPreview() {
    Pampertemuan2Theme {
        ContohColumn()
    }
}

@Preview(showBackground = true)
@Composable
fun ContohRowPreview() {
    Pampertemuan2Theme {
        ContohRow()
    }
}
