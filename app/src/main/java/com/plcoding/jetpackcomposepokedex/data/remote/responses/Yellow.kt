package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Yellow(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_gray")
    val backGray: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_gray")
    val frontGray: String
)