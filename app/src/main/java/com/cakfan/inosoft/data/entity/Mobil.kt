package com.cakfan.inosoft.data.entity

import Kendaraan
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Mobil(
    @PrimaryKey(autoGenerate = true) override val id: Long = 0,
    val mesin: String,
    val kapasitasPenumpang: Int,
    val tipe: String,
    override val tahunKeluaran: Int,
    override val warna: String,
    override val harga: Double
) : Kendaraan(id, tahunKeluaran, warna, harga)