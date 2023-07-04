package net.wargaming.wot.blitw.ui.theme

sealed class Screen(val route: String){
    object Screen1 : Screen("screen1")
    object Screen2 : Screen("screen2")
    object Screen3 : Screen("screen3")
    object Screen4 : Screen("screen4")
    object Screen5 : Screen("screen5")
}
