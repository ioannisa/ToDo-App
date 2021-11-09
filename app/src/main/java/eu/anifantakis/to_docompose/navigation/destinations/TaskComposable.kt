package eu.anifantakis.to_docompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import eu.anifantakis.to_docompose.util.Action
import eu.anifantakis.to_docompose.util.Constants

fun NavGraphBuilder.taskComposable(navigateToListScreen: (Action) -> Unit){
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){ }
}