package com.example.miproyectofinal.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "membresias")
data class Membresia (
        @PrimaryKey var membresia:String,
        @ColumnInfo(name= "precio") var precio:Float,
        @ColumnInfo(name= "tiempo") var tiempo:String,
        @ColumnInfo(name= "entrenador") var entrenador:String
)