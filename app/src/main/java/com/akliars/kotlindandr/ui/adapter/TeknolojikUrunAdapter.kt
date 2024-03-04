package com.akliars.kotlindandr.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akliars.kotlindandr.data.entity.TeknolojikUrunler
import com.akliars.kotlindandr.databinding.CardTeknolojikUrunlerBinding

class TeknolojikUrunAdapter (var mContext: Context, var teknoUrunListesi:List<TeknolojikUrunler>)
    : RecyclerView.Adapter<TeknolojikUrunAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: CardTeknolojikUrunlerBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTeknolojikUrunlerBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {//0,1,2
        val kitap = teknoUrunListesi.get(position)
        val t = holder.tasarim

        t.imageViewTekno.setImageResource(
            mContext.resources.getIdentifier(kitap.tekno_urun_resim,"drawable",mContext.packageName)
        )
        t.textViewTekno.text = kitap.tekno_urun_ad
    }

    override fun getItemCount(): Int {
        return teknoUrunListesi.size
    }

    fun sil(kitap_id:Int){
        Log.e("Kişi Sil",kitap_id.toString())
    }

}