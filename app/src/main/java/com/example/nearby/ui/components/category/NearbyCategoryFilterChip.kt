package com.example.nearby.ui.components.category

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.nearby.data.model.NearbyCategory
import com.example.nearby.ui.theme.Gray300
import com.example.nearby.ui.theme.Gray400
import com.example.nearby.ui.theme.Typography

@Composable
fun NearbyCaegoryFilterChip( modifier: Modifier = Modifier, category: NearbyCategory, isSelected: Boolean,  onClick: (isSelected: Boolean) -> Unit
){
    FilterChip(
        modifier = modifier.padding(2.dp).heightIn(min = 36.dp),
        elevation = FilterChipDefaults.filterChipElevation( elevation = 8.dp ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = false,
            selected = isSelected,
            disabledBorderColor = Gray300,
            borderWidth = 1.dp,
            selectedBorderWidth = 0.dp,
            selectedBorderColor = Color.Transparent
        ),
        colors = FilterChipDefaults.filterChipColors(
            containerColor = Color.White,
            selectedContainerColor = Color.White,
        ),
        leadingIcon = {
            category.icon?.let {
                Icon(
                    modifier = Modifier.size(36.dp),
                    painter = painterResource(id = it),
                    tint = if(isSelected) Color.White else Gray400,
                    contentDescription = "Ícone de Filtro de Categoria"
                )
            }
        },
        label = {
            Text(
                text = category.name,
                style = Typography.bodyMedium,
                color = if(isSelected) Color.White else Gray400)
                },
        selected = isSelected,
        onClick = { onClick(!isSelected) }
    )
}