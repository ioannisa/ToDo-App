package eu.anifantakis.to_docompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import eu.anifantakis.to_docompose.navigation.destinations.listComposable
import eu.anifantakis.to_docompose.navigation.destinations.taskComposable
import eu.anifantakis.to_docompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navController: NavHostController){
    val screen = remember(navController){
        Screens(navController)
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN){
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)
    }
}