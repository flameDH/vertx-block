package com.example.starter

import com.example.starter.controller.addCar
import com.example.starter.model.init
import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.BodyHandler

class MainVerticle : AbstractVerticle() {

  override fun start(startFuture: Future<Void>) {

    var router = Router.router(vertx)

    router.route().handler(BodyHandler.create())

    router.post("/car/add").handler({ addCar(it) })

    init()

    vertx.createHttpServer().requestHandler(router).listen(9000)

  }

}
