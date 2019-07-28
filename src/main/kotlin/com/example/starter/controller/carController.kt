package com.example.starter.controller

import com.example.starter.`object`.Car
import com.example.starter.model.addCar
import io.vertx.ext.web.RoutingContext
import java.time.LocalDateTime
import java.util.*

fun addCar(ctx: RoutingContext){
  try {
    val carData = ctx.bodyAsJson.mapTo(Car::class.java)

    addCar(carData, getTimeV2())

    ctx.response().setStatusCode(200).end("{\"status\":200}")
  }
  catch(e:Exception){

    ctx.response().setStatusCode(200).end("{\"status\":400}")
  }
}

/**
* get time func
* get now datetime and set minute and second to zero
*/
private fun getTime(): LocalDateTime {
  val now = LocalDateTime.now()
  return LocalDateTime.of(now.year,now.month,now.dayOfMonth,now.hour,0,0)
}

private fun getTimeV2(): Date {
  val now = LocalDateTime.now()
  return Date(now.year,now.monthValue,now.dayOfMonth,now.hour,0,0)
}
