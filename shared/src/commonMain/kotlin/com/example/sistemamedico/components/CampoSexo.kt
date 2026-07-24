package com.example.sistemamedico.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoSexo() {

    val opciones = listOf("Masculino", "Femenino", "Otro")

    var expandido by remember { mutableStateOf(false) }
    var sexoSeleccionado by remember { mutableStateOf("") }

    ExposedDropdownMenuBox(
        expanded = expandido,
        onExpandedChange = { expandido = !expandido }
    ) {

        OutlinedTextField(
            value = sexoSeleccionado,
            onValueChange = {},
            readOnly = true,
            label = { Text("Sexo") },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandido)
            },
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = expandido,
            onDismissRequest = { expandido = false }
        ) {

            opciones.forEach { opcion ->

                DropdownMenuItem(
                    text = { Text(opcion) },
                    onClick = {
                        sexoSeleccionado = opcion
                        expandido = false
                    }
                )

            }
        }
    }
}