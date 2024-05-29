package com.akmal.pantaimalang.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akmal.pantaimalang.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get data dari intent(data yang terkirim)
        val namaPantai = intent.getStringExtra(NAMA_PANTAI)
        val gambarPantai = intent.getIntExtra(GAMBAR_PANTAI, 0)
        val deskripsiPantai = intent.getStringExtra(DESKRIPSI_PANTAI)
        val isiArtikel = intent.getStringExtra(ISI_ARTIKEL)

        //mengikat data ke view
        binding.tvJudulDetail.text = namaPantai
        binding.ivDetailPantai.setImageResource(gambarPantai)
        binding.tvDeskripsiDetail.text = deskripsiPantai
        binding.tvDeskripsiDetail.text = isiArtikel

    }
    // membuat object item data yang akan diterima dan dikirimkan
    companion object{
        const val NAMA_PANTAI = "nama-pantai"
        const val GAMBAR_PANTAI = "gambar-pantai"
        const val DESKRIPSI_PANTAI = "deskripsi-pantai"
        const val ISI_ARTIKEL = "isi-artikel"
    }
}