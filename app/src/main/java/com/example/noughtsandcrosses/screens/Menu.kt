package com.example.noughtsandcrosses.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.noughtsandcrosses.objects.RouteScreen
import com.example.noughtsandcrosses.ui.theme.ColLightBlue
import com.example.noughtsandcrosses.ui.theme.ColLightPurple
import com.example.noughtsandcrosses.ui.theme.NoughtsAndCrossesTheme
import com.example.noughtsandcrosses.ui.theme.Typography

@Composable
fun Menu(navController: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        ColLightPurple,
                        ColLightBlue,
                        ColLightBlue,
                        ColLightPurple
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Select the number of players",
                style = Typography.titleLarge,
                modifier = Modifier.padding(bottom = 20.dp))
            Button(
                onClick = {
                    /*TODO: Переход на страницу с роботом*/
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColLightPurple
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "1 player",
                    style = Typography.bodyLarge)
            }
            Button(
                onClick = {
                    navController!!.navigate(RouteScreen.FIELD) {
                        popUpTo(RouteScreen.MENU) {
                            inclusive = true
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColLightPurple
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "2 players",
                    style = Typography.bodyLarge)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    NoughtsAndCrossesTheme {
        Menu(null)
    }
}