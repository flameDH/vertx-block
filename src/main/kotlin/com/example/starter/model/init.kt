package com.example.starter.model

import com.example.starter.globalParam.carCollection
import com.example.starter.globalParam.database
import com.example.starter.globalParam.mongoClient
import com.mongodb.client.model.IndexOptions
import org.bson.Document

import java.util.concurrent.TimeUnit

fun init(){

  val mCollection = mongoClient.mongo.getDatabase(database).getCollection(carCollection)

  //create Index unique and create colllection
  mCollection.createIndex(Document("brand", 1).append("color", 1).append("city", 1)
    .append("hour", 1), IndexOptions().unique(true))

  //create Index expireAfterSeconds
  mCollection.createIndex(Document("hour", 1), IndexOptions().expireAfter(2592000, TimeUnit.SECONDS))

}


