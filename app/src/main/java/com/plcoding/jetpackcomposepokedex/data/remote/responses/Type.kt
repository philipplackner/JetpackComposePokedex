package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Type(
    val slot: Int,
    val type: TypeX
)