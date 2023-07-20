package com.damo.laboratorio

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.damo.laboratorio.config.MantenimientoDB

class MantenimientoApplication : Application() {

    companion object{
        lateinit var database: MantenimientoDB
    }


    override fun OnCreate(){
        super.onCreate()
        database = Room.databaseBuilder(this, MantenimientoDB::class.java, "MantenimientoDb").build()
    }
}
