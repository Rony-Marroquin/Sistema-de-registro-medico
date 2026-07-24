package com.example.sistemamedico.components



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoFechaNacimiento(
    fecha: String,
    onFechaChange: (String) -> Unit
) {

    OutlinedTextField(
        value = fecha,
        onValueChange = { },
        readOnly = true,
        label = {
            Text("Fecha de nacimiento")
        },
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // Aquí abrirás el DatePicker
            }
    )
}