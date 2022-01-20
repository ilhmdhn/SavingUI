package com.ilhmdhn.saving.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TransactionModel(
    var type: String ="",
    var desc: String ="",
    var date: String ="",
    var value: String =""
): Parcelable