package com.example.starter.model

import com.example.starter.`object`.Car
import com.example.starter.globalParam.carCollection
import com.example.starter.globalParam.database
import com.example.starter.globalParam.mongoClient
import com.mongodb.client.model.UpdateOptions
import org.bson.Document
import java.util.*

fun addCar (carData : Car, time: Date) {

  val collection =mongoClient.mongo.getDatabase(database).getCollection(carCollection)

  val doc= Document("brand", carData.brand).append("city", carData.city)
    .append("color", carData.color).append("time",time)


  collection.updateOne(doc,Document("\$inc", Document("count",1)), UpdateOptions().upsert(true))

}
