package com.example.myproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*
INTENT EXPLICIT
Data Class adalah sebuah kelas biasa yang tidak bergantung pada kelas lainnya.
Class ini berfungsi untuk menyimpan model data suatu obyek.
 */

@Parcelize
data class MCU(
    var title : String ="",
    var director: String = "",
    var release: String = "",
    var synopsis: String = "",
    var cast: String = "",
    var photo: Int = 0
):Parcelable