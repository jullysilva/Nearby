package com.example.nearby.data.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NearbyCategoryFilterChipList(modifier: Modifier = Modifier, categories: List<NearbyCategory>, onSelectedCategoryChanged: (NearbyCategory) -> Unit ) {
    var _selectedCategoryId by remember {
        mutableListOf()

    }
}