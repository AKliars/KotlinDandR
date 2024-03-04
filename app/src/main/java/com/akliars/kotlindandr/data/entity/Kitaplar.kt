package com.akliars.kotlindandr.data.entity

import java.io.Serializable

data class Kitaplar(var kitap_id:Int,
                   var kitap_ad:String,
                   var kitap_resim:String,
                   var kitap_yazar:String) : Serializable {
}