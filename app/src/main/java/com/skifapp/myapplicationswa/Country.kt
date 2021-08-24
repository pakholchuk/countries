package com.skifapp.myapplicationswa

data class Country(
    val name: String,
    val localizedName: String? = null,
    val callingCode: Int,
    val iso3166Code: String,
    val mobilePhonePrefixes: List<Int>? = null,
    val phoneLength: Int?
)
