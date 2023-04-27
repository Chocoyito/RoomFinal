package com.example.roomexample

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.miproyectofinal.entidades.Membresia
import com.example.miproyectofinal.entidades.Usuario

@Dao
interface DaoUsuario {
    @Query("SELECT * FROM usuarios")
    suspend fun obtenerUsuarios(): List<Usuario>

    @Insert
    suspend fun agregarUsuario(usuario: Usuario)

    @Query("UPDATE usuarios set nombre=:nombre, peso=:peso, sexo=:sexo WHERE usuario=:usuario")
    suspend fun modificarUsuario(nombre:String, peso:String, sexo:String, usuario:String)

    @Query("DELETE FROM usuarios WHERE usuario=:usuario")
    suspend fun eliminarUsuario(usuario:String)

    @Delete
    suspend fun eliminarUsuario(usuario: Usuario)
}