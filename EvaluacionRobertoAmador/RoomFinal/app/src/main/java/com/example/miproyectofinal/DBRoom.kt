package com.example.roomexample

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.DaoMembresia
import com.example.miproyectofinal.entidades.Usuario


@Database(
    entities = [Usuario::class],
    version =1
)
abstract class DBroom:RoomDatabase() {
    abstract fun daoUsuario():DaoUsuario
    abstract fun daoMembresia():DaoMembresia

}