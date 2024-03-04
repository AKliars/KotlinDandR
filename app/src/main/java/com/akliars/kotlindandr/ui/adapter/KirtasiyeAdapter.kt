package com.akliars.kotlindandr.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akliars.kotlindandr.data.entity.Kirtasiye
import com.akliars.kotlindandr.databinding.CardKirtasiyeBinding
import com.akliars.kotlindandr.databinding.CardKitaplarBinding

class KirtasiyeAdapter(var mContext: Context, var kirtasiyeListesi:List<Kirtasiye>)
    : RecyclerView.Adapter<KirtasiyeAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: CardKirtasiyeBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardKirtasiyeBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {//0,1,2
        val kitap = kirtasiyeListesi.get(position)
        val t = holder.tasarim

        t.imageViewKirtasiye.setImageResource(
            mContext.resources.getIdentifier(kitap.kirtasiye_resim,"drawable",mContext.packageName)
        )
        t.textViewKirtasiyeAd.text = kitap.kirtasiye_ad
    }

    override fun getItemCount(): Int {
        return kirtasiyeListesi.size
    }

    fun sil(kitap_id:Int){
        Log.e("Kişi Sil",kitap_id.toString())
    }

}