package com.example.starter.globalParam

import com.mongodb.MongoClient


const val database:String ="block"
const val carCollection :String ="carHourCounts"

/**
 * singleton , only one mongoClient instance in this service
 */
object mongoClient{
  val mongo = MongoClient()
}
