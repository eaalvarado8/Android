package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mayor_menor()
        //nmultiplica()
        alumPro()
    }

    //Comprobar si es mayor o menor de edad
    fun mayor_menor(){
        var edad = 18
        var mayor = (edad >= 18)
        var menor = (edad < 18)

        if(mayor == true){
            println("Usted es mayor de edad")
        }else if(menor == true){
            println("Usted es menor de edad")
        }
    }

    // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
    fun nmultiplica(){
        var num = 12
        var c = 1
        var result: Int
        while (num > c){
            result = num * c
            println("$num * $c = $result")
            c + 1
        }
    }

    //Mostrar el listado de paralelo de la materia de Plataformas móviles
    // y los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun alumPro(){
        var myMap: Map<String,Int> = mapOf()
        myMap= mutableMapOf("ALVARADO ONTANEDA ERIC ANTONIO" to 1, "JARAMILLO OCHOA ADRIANA SOFIA" to 2, "CARAGUAY CORREA MIGUEL ANGEL" to 2, "LEIVA ESPINOZA DIEGO JOSE" to 1)
        println(myMap)
        println("RESULTADO SIN ORDENAR")
        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")

        }
        val result: Map<String, Int> = TreeMap(myMap)

        println("RESULTADO ORDENADO")
        for (myElement in result){
            println("${myElement.key}-${myElement.value}")
        }

        println("Resultado por grupos")
        println("Proyecto 1")
        for (myElement in result){
            if(myElement.value == 1){
                println(myElement.key)
            }
        }

        println("Proyecto 2")
        for (myElement in result){
            if(myElement.value == 2){
                println(myElement.key)
            }
        }
    }

    //Presentar las propiedades de un vehículo utilizando clases, como
    // tracción, motor, tipo de vehículo, capacidad


    fun cedula(){
        var myArray= arrayListOf<Int>()
        myArray.addAll(listOf(1, 1, 0, 5, 9, 9, 7, 7, 3, 6))
    }
}