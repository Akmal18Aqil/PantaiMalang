package com.akmal.pantaimalang.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akmal.pantaimalang.R
import com.akmal.pantaimalang.ui.DetailActivity.Companion.DESKRIPSI_PANTAI
import com.akmal.pantaimalang.ui.DetailActivity.Companion.GAMBAR_PANTAI
import com.akmal.pantaimalang.ui.DetailActivity.Companion.NAMA_PANTAI
import com.akmal.pantaimalang.adapters.PantaiAdapter
import com.akmal.pantaimalang.databinding.ActivityMainBinding
import com.akmal.pantaimalang.models.PantaiModel
import com.akmal.pantaimalang.ui.DetailActivity.Companion.ISI_ARTIKEL

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    // onCreate adalah fungsi yang pertama kali dijalankan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Data yang akan ditampilkan
        val itemPantaiBinding = arrayOf(
            PantaiModel(
                "Teluk Asmara",
                R.drawable.asmara,
                "Pantai terindah untuk kasih",
                "Pantai Watu Leter adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Hindia secara administratif berada di Dusun Rowotrate, Desa Sitiarjo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang, Jawa Timur.[1] Pantai ini terletak bersebelahan dengan Pantai Goa China. Tetapi pantai ini masih belum banyak dikenal orang karena letaknya terpencil dan jarang sekali dikunjungi oleh wisatawan. Dari Kota Malang berjarak sekitar 60 km dan dapat ditempuh sekitar 3 jam perjalanan dengan kendaraan bermotor. Untuk mencapainya dari Kota Malang bisa mengambil arah selatan menuju Sumbermanjing Wetan dan mengikuti arah menuju ke Pantai Sendangbiru. Lalu terdapat sebuah pertigaan dengan papan petunjuk arah ke kanan akan menuju ke Pantai Bajulmati dan Goa China."
            ),
            PantaiModel(
                "Goa Cina",
                R.drawable.guacina,
                "Pantai terindah untuk kasih",
                "Pantai Watu Leter adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Hindia secara administratif berada di Dusun Rowotrate, Desa Sitiarjo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang, Jawa Timur.[1] Pantai ini terletak bersebelahan dengan Pantai Goa China. Tetapi pantai ini masih belum banyak dikenal orang karena letaknya terpencil dan jarang sekali dikunjungi oleh wisatawan. Dari Kota Malang berjarak sekitar 60 km dan dapat ditempuh sekitar 3 jam perjalanan dengan kendaraan bermotor. Untuk mencapainya dari Kota Malang bisa mengambil arah selatan menuju Sumbermanjing Wetan dan mengikuti arah menuju ke Pantai Sendangbiru. Lalu terdapat sebuah pertigaan dengan papan petunjuk arah ke kanan akan menuju ke Pantai Bajulmati dan Goa China."
            ),
            PantaiModel(
                "Watu Leter",
                R.drawable.watu,
                "Pantai terindah untuk kasih",
                "Pantai Watu Leter adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Hindia secara administratif berada di Dusun Rowotrate, Desa Sitiarjo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang, Jawa Timur.[1] Pantai ini terletak bersebelahan dengan Pantai Goa China. Tetapi pantai ini masih belum banyak dikenal orang karena letaknya terpencil dan jarang sekali dikunjungi oleh wisatawan. Dari Kota Malang berjarak sekitar 60 km dan dapat ditempuh sekitar 3 jam perjalanan dengan kendaraan bermotor. Untuk mencapainya dari Kota Malang bisa mengambil arah selatan menuju Sumbermanjing Wetan dan mengikuti arah menuju ke Pantai Sendangbiru. Lalu terdapat sebuah pertigaan dengan papan petunjuk arah ke kanan akan menuju ke Pantai Bajulmati dan Goa China."
            ),
            PantaiModel(
                "Teluk Asmara",
                R.drawable.asmara,
                "Pantai terindah untuk kasih",
                "Pantai Watu Leter adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Hindia secara administratif berada di Dusun Rowotrate, Desa Sitiarjo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang, Jawa Timur.[1] Pantai ini terletak bersebelahan dengan Pantai Goa China. Tetapi pantai ini masih belum banyak dikenal orang karena letaknya terpencil dan jarang sekali dikunjungi oleh wisatawan. Dari Kota Malang berjarak sekitar 60 km dan dapat ditempuh sekitar 3 jam perjalanan dengan kendaraan bermotor. Untuk mencapainya dari Kota Malang bisa mengambil arah selatan menuju Sumbermanjing Wetan dan mengikuti arah menuju ke Pantai Sendangbiru. Lalu terdapat sebuah pertigaan dengan papan petunjuk arah ke kanan akan menuju ke Pantai Bajulmati dan Goa China."
            ),
            PantaiModel(
                "Teluk Asmara",
                R.drawable.asmara,
                "Pantai terindah untuk kasih",
                "Pantai Watu Leter adalah sebuah pantai di pesisir selatan yang terletak di tepi Samudera Hindia secara administratif berada di Dusun Rowotrate, Desa Sitiarjo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang, Jawa Timur.[1] Pantai ini terletak bersebelahan dengan Pantai Goa China. Tetapi pantai ini masih belum banyak dikenal orang karena letaknya terpencil dan jarang sekali dikunjungi oleh wisatawan. Dari Kota Malang berjarak sekitar 60 km dan dapat ditempuh sekitar 3 jam perjalanan dengan kendaraan bermotor. Untuk mencapainya dari Kota Malang bisa mengambil arah selatan menuju Sumbermanjing Wetan dan mengikuti arah menuju ke Pantai Sendangbiru. Lalu terdapat sebuah pertigaan dengan papan petunjuk arah ke kanan akan menuju ke Pantai Bajulmati dan Goa China."
            )
        )
        //mengatur layout manager dengan adapter untuk Recycle View
        binding.rvItemPantai.layoutManager = LinearLayoutManager(this)
        // inisialisasi adapter dengan intent
        binding.rvItemPantai.adapter = PantaiAdapter(itemPantaiBinding){data ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra(NAMA_PANTAI, data.namaPantai)
                putExtra(GAMBAR_PANTAI, data.gambarPantai)
                putExtra(DESKRIPSI_PANTAI, data.deskripsiPantai)
                putExtra(ISI_ARTIKEL, data.isiArtikel)
            }
            startActivity(intent)
        }

    }
}