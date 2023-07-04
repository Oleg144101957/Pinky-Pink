package net.wargaming.wot.blitw.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MainNavigation() {

    val navigation = rememberNavController()

    NavHost(navController = navigation, startDestination = Screen.Screen1.route){
        composable(route = Screen.Screen1.route){
            Screen1(navigation)
        }

        composable(route = Screen.Screen2.route){
            Screen2(navigation)
        }

        composable(route = Screen.Screen3.route){
            Screen3()
        }
    }


}