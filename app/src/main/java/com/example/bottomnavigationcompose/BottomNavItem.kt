package com.example.bottomnavigationcompose

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Dilara Kiraz on 10.09.2024.
 */
data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int = 0
)

