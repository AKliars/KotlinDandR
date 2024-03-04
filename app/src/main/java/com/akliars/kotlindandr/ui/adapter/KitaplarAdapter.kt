package com.akliars.kotlindandr.ui

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akliars.kotlindandr.data.entity.Kitaplar
import com.akliars.kotlindandr.databinding.CardKitaplarBinding
import com.google.android.material.snackbar.Snackbar

class KitaplarAdapter(var mContext: Context, var kitapListesi:List<Kitaplar>)
    : RecyclerView.Adapter<KitaplarAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:CardKitaplarBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardKitaplarBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {//0,1,2
        val kitap = kitapListesi.get(position)
        val t = holder.tasarim

        t.imageViewKitap.setImageResource(
            mContext.resources.getIdentifier(kitap.kitap_resim,"drawable",mContext.packageName)
        )
        t.textViewKitapAd.text = kitap.kitap_ad
        t.textViewYazar.text = kitap.kitap_yazar


        /* t.cardViewSatir.setOnClickListener {
             val gecis = AnasayfaFragmentDirections.kitapDetayGecis(kitap=kitap)
             Navigation.findNavController(it).navigate(gecis)

         }

         t.imageViewSil.setOnClickListener{
             Snackbar.make(it,"${kitap.kitap_ad} silinsin mi?", Snackbar.LENGTH_SHORT)
                 .setAction("EVET"){
                     sil(kitap.kitap_id)
                 }.show()
         }*/

    }

    override fun getItemCount(): Int {
        return kitapListesi.size
    }

    fun sil(kitap_id:Int){
        Log.e("Kişi Sil",kitap_id.toString())
    }

}
