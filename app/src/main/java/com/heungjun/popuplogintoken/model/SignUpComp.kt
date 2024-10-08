package com.heungjun.popuplogintoken.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ComSignUP(
    @SerialName("address")
    val address: String,
    @SerialName("companyId")
    val companyId: String,
    @SerialName("companyName")
    val companyName: String,
    @SerialName("email")
    val email: String,
    @SerialName("managerName")
    val managerName: String,
    @SerialName("password")
    val password: String,
    @SerialName("detailAddress")
    val detailAddress: String,  // 추가된 필드
    @SerialName("postCode")
    val postCode: String        // 추가된 필드
)



@Serializable
data class SignUpCompResponse(
    @SerialName("data")
    val `data`: List<ComSignUP>,
    @SerialName("message")
    val message: String,
    @SerialName("result")
    val result: Boolean
)