package com.example.starter.`object`

import com.fasterxml.jackson.annotation.JsonProperty

data class Car(
  @JsonProperty("brand") val brand: String,
  @JsonProperty("color") val color : String,
  @JsonProperty("city") val city: String
)
