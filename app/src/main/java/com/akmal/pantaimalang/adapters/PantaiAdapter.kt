package com.akmal.pantaimalang.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akmal.pantaimalang.databinding.ItemPantaiBinding
import com.akmal.pantaimalang.models.PantaiModel
// Apdapter itu penghubung
class PantaiAdapter(var list: Array<PantaiModel>, val onCLick: (PantaiModel) -> Unit): RecyclerView.Adapter<PantaiAdapter.ViewHolder>(){
    // kelas yang menginisialisasi data ke view
    inner class ViewHolder(var binding: ItemPantaiBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(data: PantaiModel){
        binding.apply {
            tvNamapantai.text = data.namaPantai
            tvDeskripsi.text = data.deskripsiPantai
            ivPantai.setImageResource(data.gambarPantai)
            root.setOnClickListener {onCLick(data)}
        }
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPantaiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }


}