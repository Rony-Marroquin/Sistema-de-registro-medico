package com.example.sistemamedico.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistemamedico.components.FormularioRegistro

@Composable
fun HomeScreen (){
    Scaffold(

       contentColor = Color(222, 242, 233),

        topBar = {
            TopAppBar(

                colors = topAppBarColors(
                    containerColor = Color(37, 135, 218),
                    titleContentColor = Color.White,
                ),
                title = {
                    Column {
                        Text("Expediente clínicos")
                        Text("Sistema de gestión de pacientes", fontSize = 10.sp)
                    }
                },
                actions = {
                    TextButton(onClick = {},

                    ){
                        Text("Nuevo paciente",
                            color = Color.White)
                    }

                    TextButton(onClick = {}){
                        Text("Listado",
                            color = Color.White)
                    }


                }
            )


        },



        )

    {
        paddingValues ->

        FormularioRegistro(modifier = Modifier.padding(paddingValues)
            .padding(top = 16.dp))
    }



}