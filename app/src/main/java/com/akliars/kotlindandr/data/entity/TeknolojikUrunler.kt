package com.akliars.kotlindandr.data.entity

import java.io.Serializable

data class TeknolojikUrunler
    (var tekno_urun_id:Int,
     var tekno_urun_ad:String,
     var tekno_urun_resim:String, ) : Serializable {
}