package com.example.miproyectofinal.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuario(
        @PrimaryKey var usuario:String,
        @ColumnInfo(name= "nombre") var nombre:String,
        @ColumnInfo(name= "peso") var peso:String,
        @ColumnInfo(name= "sexo") var sexo:String
)
