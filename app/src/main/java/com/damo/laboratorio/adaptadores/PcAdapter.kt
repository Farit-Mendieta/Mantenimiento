package com.damo.laboratorio.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.damo.laboratorio.OnClickListener
import com.damo.laboratorio.R
import com.damo.laboratorio.databinding.ItemListBinding
import com.damo.laboratorio.entity.PcEntity

class PcAdapter(private var pcAdaps: MutableList<PcEntity>, private var listener: OnClickListener) :
RecyclerView.Adapter<PcAdapter.ViewHolder>() {

    private lateinit var mContext: Context

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemListBinding.bind(view)

        fun setListener(pcEntity: PcEntity) {
            binding.root.setOnClickListener { listener.onClick(pcEntity) }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       mContext = parent.context
       val view = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = pcAdaps.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val pcEntity = pcAdaps.get(position)

        with(holder){
            setListener(pcEntity)
            binding.tvNombre.text= pcEntity.nombre
        }
    }

    fun add(pcEntity: PcEntity){
        pcAdaps.add(pcEntity)
        notifyDataSetChanged()
    }


}
