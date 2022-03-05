package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Sprites(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    val other: Other,
    val versions: Versions
)