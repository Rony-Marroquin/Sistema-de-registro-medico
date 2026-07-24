package com.example.sistemamedico.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormularioRegistro (modifier: Modifier = Modifier) {

    var fechaNacimiento by remember { mutableStateOf("")
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(
                    color = Color(37, 135, 218),
                    shape = RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp)
                )

        ) {
            Text(
                text = "Registro de nuevo paciente",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        BoxWithConstraints {


                if (maxWidth < 600.dp) {

                    //  MÓVIL
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(12.dp)

                    ) {


                        OutlinedTextField(
                            value = "",
                            onValueChange = {  },
                            label = { Text("Primer Apellido") },
                            modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = {  },
                            label = { Text("Segundo Apellido") },
                            modifier = Modifier.fillMaxWidth()
                        )


                        OutlinedTextField(
                            value = "",
                            onValueChange = {  },
                            label = { Text("Nombres") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        /////////

                        CampoSexo()

                        CampoFechaNacimiento(fecha = fechaNacimiento,
                            onFechaChange = {
                                fechaNacimiento = it
                            })

                        //aqui va la edad

                        OutlinedTextField(
                            value = "",
                            onValueChange = {  },
                            label = { Text("Segundo Apellido") },
                            modifier = Modifier.fillMaxWidth()
                        )


                        OutlinedTextField(
                            value = "",
                            onValueChange = {  },
                            label = { Text("Nombres") },
                            modifier = Modifier.fillMaxWidth()
                        )

                        CampoEstadoCivil()

                        OutlinedTextField(
                            value = "",
                            onValueChange = { /*edad = it*/ },
                            label = { Text("DUI") },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number
                            )
                        )


                        OutlinedTextField(
                            value = "",
                            onValueChange = { /*edad = it*/ },
                            label = { Text("Telefono") },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number
                            )
                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Ocupacion") },
                            modifier = Modifier.weight(1f)
                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Direccion ") },
                            modifier = Modifier.weight(1f)
                        )

                        TituloSeccion("Datos de la familia")

                    }




                }

                else {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {



                        //  DESKTOP
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {

                            OutlinedTextField(
                                value = "",
                                onValueChange = { },
                                label = { Text("Primer Apellido") },
                                modifier = Modifier.weight(1f)
                            )

                            OutlinedTextField(
                                value = "",
                                onValueChange = { },
                                label = { Text("Segundo Apellido") },
                                modifier = Modifier.weight(1f)
                            )

                            OutlinedTextField(
                                value = "",
                                onValueChange = { },
                                label = { Text("Nombres") },
                                modifier = Modifier.weight(1f)
                            )

                    }
                        Row( modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                            CampoSexo()

                            CampoFechaNacimiento(fecha = fechaNacimiento,
                                onFechaChange = {
                                    fechaNacimiento = it
                                })


                              //aqui v ala edad


                        }

                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                            horizontalArrangement = Arrangement.spacedBy(50.dp)) {

                           CampoEstadoCivil()

                            OutlinedTextField(
                                value = "",
                                onValueChange = { /*edad = it*/ },
                                label = { Text("DUI") },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number
                                )
                            )


                            OutlinedTextField(
                                value = "",
                                onValueChange = { /*edad = it*/ },
                                label = { Text("Telefono") },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number
                                )
                            )
                        }

                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            OutlinedTextField(
                                value = "",
                                onValueChange = { },
                                label = { Text("Ocupacion") },
                                modifier = Modifier.weight(1f)
                            )

                            OutlinedTextField(
                                value = "",
                                onValueChange = { },
                                label = { Text("Direccion ") },
                                modifier = Modifier.weight(1f)
                            )
                        }







                    }

            }

        }
        TituloSeccion("Datos de la familia")

    }
}