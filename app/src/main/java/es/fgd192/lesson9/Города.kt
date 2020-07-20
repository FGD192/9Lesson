package es.fgd192.lesson9

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Города (
    var London: String,
    var Manchester: String,
    var Liverpull: String,
    var Birminghem: String,
    var York: String,
    var Bristol: String,
    var Kembridg: String,
    var Oxford: String,
    var Batt: String,
    var Nottinghem: String,

    var Buenos_Ayres: String,
    var Mendosa: String,
    var Ushuaya: String,
    var Kordova: String,
    var Salta: String,
    var Rosarito: String,
    var La_Plata: String,
    var San_Huan: String,
    var Posadas: String,
    var Jujuy: String,

    var Pekin: String,
    var Shanhiy: String,
    var Uhan: String,
    var Guanchjou: String,
    var Chendu: String,
    var Cian: String,
    var Harbin: String,
    var Shenyan: String,
    var Chansha: String,
    var Nankin: String
 ):Parcelable