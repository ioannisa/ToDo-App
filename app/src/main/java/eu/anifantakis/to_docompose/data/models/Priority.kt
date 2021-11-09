package eu.anifantakis.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import eu.anifantakis.to_docompose.ui.theme.HighPriorityColor
import eu.anifantakis.to_docompose.ui.theme.LowPriorityColor
import eu.anifantakis.to_docompose.ui.theme.MediumPriorityColor
import eu.anifantakis.to_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}