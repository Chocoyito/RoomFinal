package com.example.miproyectofinal.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.miproyectofinal.entidades.Membresia

@Dao
interface DaoMembresia {
    @Query("SELECT * FROM membresias")
    suspend fun obtenerMembresias(): List<Membresia>

    @Insert
    suspend fun agregarMembresia(membresia: Membresia)

    @Query("UPDATE membresias set precio=:precio, tiempo=:tiempo, entrenador=:entrenador WHERE membresia=:membresia")
    suspend fun modificarMembresias(precio:Float, tiempo:String, entrenador:String, membresia: String)

    @Query("DELETE FROM membresias WHERE membresia=:membresia")
    suspend fun eliminarMembresia(membresia: String)

    @Delete
    suspend fun eliminarMembresia(membresia: Membresia)
}