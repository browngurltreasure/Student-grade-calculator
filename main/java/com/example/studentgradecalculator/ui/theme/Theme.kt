package com.example.studentgradecalculator.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF00FFFF),
    secondary = androidx.compose.ui.graphics.Color(0xFF00FFFF),
    tertiary = androidx.compose.ui.graphics.Color(0xFF00FFFF)
)

private val LightColorScheme = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF00FFFF),
    secondary = androidx.compose.ui.graphics.Color(0xFF00FFFF),
    tertiary = androidx.compose.ui.graphics.Color(0xFF00FFFF)
)

@Composable
fun StudentGradeCalculatorKotlinVersionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography,
        content = content
    )
}