package com.damo.laboratorio

import com.damo.laboratorio.entity.PcEntity

interface OnClickListener {
    fun onClick(pcEntity: PcEntity)
    fun onDeletePc(pcEntity: PcEntity)
}