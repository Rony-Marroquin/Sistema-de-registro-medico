package com.example.sistemamedico.components

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoEstadoCivil() {

    val opciones = listOf(
        "Soltero(a)",
        "Casado(a)",
        "Divorciado(a)",
        "Acompañado(a)",
        "Viudo(a)"
    )

    var expandido by remember { mutableStateOf(false) }
    var estadoSeleccionado by remember { mutableStateOf("") }

    ExposedDropdownMenuBox(
        expanded = expandido,
        onExpandedChange = {
            expandido = !expandido
        }
    ) {

        OutlinedTextField(
            value = estadoSeleccionado,
            onValueChange = {},
            readOnly = true,
            label = {
                Text("Estado civil")
            },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandido)
            },
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = expandido,
            onDismissRequest = {
                expandido = false
            }
        ) {

            opciones.forEach { opcion ->

                DropdownMenuItem(
                    text = {
                        Text(opcion)
                    },
                    onClick = {
                        estadoSeleccionado = opcion
                        expandido = false
                    }
                )
            }
        }
    }
}