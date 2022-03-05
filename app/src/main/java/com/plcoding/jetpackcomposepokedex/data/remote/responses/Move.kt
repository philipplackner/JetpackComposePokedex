package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Move(
    val move: MoveX,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)