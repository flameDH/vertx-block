package com.example.starter

import io.vertx.core.Vertx


fun main(args: Array<String>) {

  Vertx.vertx().deployVerticle(MainVerticle())
}



