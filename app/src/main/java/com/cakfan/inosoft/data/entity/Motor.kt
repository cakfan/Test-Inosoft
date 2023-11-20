package com.cakfan.inosoft.data.entity


import Kendaraan
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Motor(
    @PrimaryKey(autoGenerate = true) override val id: Long = 0,
    val mesin: String,
    val tipeSuspensi: String,
    val tipeTransmisi: String,
    override val tahunKeluaran: Int,
    override val warna: String,
    override val harga: Double
) : Kendaraan(id, tahunKeluaran, warna, harga)