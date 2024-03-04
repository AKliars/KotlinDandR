package com.akliars.kotlindandr.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.akliars.kotlindandr.R
import com.akliars.kotlindandr.data.entity.Kirtasiye
import com.akliars.kotlindandr.data.entity.Kitaplar
import com.akliars.kotlindandr.data.entity.TeknolojikUrunler
import com.akliars.kotlindandr.databinding.FragmentAnasayfaBinding
import com.akliars.kotlindandr.ui.KitaplarAdapter
import com.akliars.kotlindandr.ui.adapter.KirtasiyeAdapter
import com.akliars.kotlindandr.ui.adapter.TeknolojikUrunAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentAnasayfaBinding.inflate(inflater, container, false)


        //KitapListesi
        val kitapListesi = ArrayList<Kitaplar>()
        val f1 = Kitaplar(1,"Hayır Diyebilme Sanatı","muthis_psikoloji","Müthiş Psikoloji")
        val f2 = Kitaplar(2,"Atomic Habits: The life-changing million copy bestseller","atomic_habits","James Clear")
        val f3 = Kitaplar(3,"Alışkanlıkların Gücü","aliskanliklarin_gucu","Charles Duhigg")
        val f4 = Kitaplar(4,"Düşüncenin Gücü","dusuncenin_gucu","James Allen")
        val f5 = Kitaplar(5,"Kanatların Var Ruhunda","kanatlarin_var_ruhunda","Nil Karaibrahimgil")
        val f6 = Kitaplar(6,"Charles Dickens Seti - 3 Kitap Takım","charles_dickens_set","Charles Dickens")
        kitapListesi.add(f1)
        kitapListesi.add(f2)
        kitapListesi.add(f3)
        kitapListesi.add(f4)
        kitapListesi.add(f5)
        kitapListesi.add(f6)

        //KirtasiyeListesi
        val kirtasiyeListesi = ArrayList<Kirtasiye>()
        val k1 = Kirtasiye(1,"Eastpak Padded Pak'R Camo Sırt Çantası","canta")
        val k2 = Kirtasiye(2,"Faber-Castell Permanent S Siyah Asetat Kalemi","kalem")
        val k3 = Kirtasiye(3,"İnterpano 45 x 60 Ahşap Çerçeveli Laminant Yüzey Duvara Monte Beyaz Yazı Tahtası","beyaz_pano")
        val k4 = Kirtasiye(4,"Maped Pastel Renk 6lı Fosforlu Kalem 742558","pastel_kalem")
        val k5 = Kirtasiye(5,"Proje Çantası 35X50 Siyah","proje_cantasi")
        val k6 = Kirtasiye(6,"Gıpta Envıro Sp. Sep. Sert Kpk.Def. 17X24 120 Yp.Çizgili","defter")
        kirtasiyeListesi.add(k1)
        kirtasiyeListesi.add(k2)
        kirtasiyeListesi.add(k3)
        kirtasiyeListesi.add(k4)
        kirtasiyeListesi.add(k5)
        kirtasiyeListesi.add(k6)


        //TeknolojikUrunlerListesi
        val teknoListe = ArrayList<TeknolojikUrunler>()
        val t1 = TeknolojikUrunler(1,"Fryer","fryer")
        val t2 = TeknolojikUrunler(2,"Apple iPhone 13 128 GB Cep Telefonu Beyaz MLPG3TU/A","iphone13")
        val t3 = TeknolojikUrunler(3,"HP 14-Em0002nt Ryzen 7-7730u 8gb 256gb Amd Radeon Graphıcs 14.0 \" W11 7p6e0ea Jet Black Notebook","laptop")
        val t4 = TeknolojikUrunler(4,"Kobo Nia Siyah E-Kitap Okuma Cihazı","kitap_okuma_cihazi")
        val t5 = TeknolojikUrunler(5,"JBL Tune 560Bt Wireless Kulaklık Ct OE Mavi","kulaklik")
        val t6 = TeknolojikUrunler(6,"Gıpta Envıro Sp. Sep. Sert Kpk.Def. 17X24 120 Yp.Çizgili","defter")
        teknoListe.add(t1)
        teknoListe.add(t2)
        teknoListe.add(t3)
        teknoListe.add(t4)
        teknoListe.add(t5)
        teknoListe.add(t6)


        val KitaplarAdapter = KitaplarAdapter(requireContext(),kitapListesi)
        binding.kitaplarRv.adapter =KitaplarAdapter

        binding.kitaplarRv.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val KirtasiyeAdapter = KirtasiyeAdapter(requireContext(),kirtasiyeListesi)
        binding.kirtasiyeRv.adapter =KirtasiyeAdapter

        binding.kirtasiyeRv.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val TeknolojikUrunAdapter= TeknolojikUrunAdapter(requireContext(),teknoListe)
        binding.teknolojikUrunRv.adapter =TeknolojikUrunAdapter

        binding.teknolojikUrunRv.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)



        return binding.root
    }

}