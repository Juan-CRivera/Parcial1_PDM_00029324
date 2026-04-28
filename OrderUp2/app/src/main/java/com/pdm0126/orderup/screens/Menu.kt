package com.pdm0126.orderup.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pdm0126.orderup.item.itemLista
import com.pdm0126.orderup.model.menu


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu(
    navigateToOrder: (Int) -> Unit) {
    Scaffold { innerPadding ->
        LazyColumn(modifier = Modifier
            .padding(innerPadding)) {

            items(menu) { producto ->
                itemLista(
                    producto = producto,
                    onClick = { navigateToOrder(producto.id) }
                )
            }
        }
    }
}