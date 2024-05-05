package com.example.noughtsandcrosses.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.noughtsandcrosses.screens.Field
import com.example.noughtsandcrosses.screens.Menu
import com.example.noughtsandcrosses.objects.RouteScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,//контроллер отвечающий за перемещения
        startDestination = RouteScreen.MENU
    )
    {
        composable(RouteScreen.MENU) {
            Menu(navController)
        }
        composable(RouteScreen.FIELD) {
            Field(navController)
        }
    }
}