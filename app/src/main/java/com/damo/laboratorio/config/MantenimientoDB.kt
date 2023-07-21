package com.damo.laboratorio.config

import androidx.room.Database
import androidx.room.RoomDatabase
import com.damo.laboratorio.dao.PcDao
import com.damo.laboratorio.entity.PcEntity

@Database(entities = arrayOf(PcEntity::class), version = 1)
abstract class MantenimientoDB : RoomDatabase(){
    abstract fun pcDao() : PcDao
}