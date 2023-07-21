package com.damo.laboratorio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.damo.laboratorio.adaptadores.PcAdapter
import com.damo.laboratorio.databinding.ActivityMainBinding
import com.damo.laboratorio.entity.PcEntity

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mAdapter: PcAdapter
    private lateinit var mGridLayout: GridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val pcEntity = PcEntity(nombre = binding.etNombre)
        }

        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        mAdapter = PcAdapter(mutableListOf(), this)
        mGridLayout = GridLayoutManager(this, 2)

        binding.miRecycler.apply {
            setHasFixedSize(true)
            layoutManager = mGridLayout
            adapter = mAdapter
        }
    }

    override fun onClick(pcEntity: PcEntity) {
        TODO("Not yet implemented")
    }

    override fun onDeletePc(pcEntity: PcEntity) {
        TODO("Not yet implemented")
    }


}