package com.pdm0126.orderup.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.orderup.screens.Menu
import com.pdm0126.orderup.screens.miOrden

@Composable
fun MainNavigation(

){
val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = {backStack.removeLastOrNull()},
        entryProvider = entryProvider{
          entry<Routes.Home>{
            Menu(
                navigateToOrder = {id ->
                    backStack.add(Routes.Order(id))
                }
            )
          }
entry<Routes.Order>{route ->
    miOrden(
        id = route.id,
    navigateBack = {backStack.removeLastOrNull()}
    )
}
        }
    )
}