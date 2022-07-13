package com.alejua39

import com.alejua39.controllers.FruitsController
import com.alejua39.utils.JsonResponseTransformer
import spark.Spark
import spark.Spark.port

class ServiceRunner {

    fun run() {

        val fruitsController = FruitsController()

        port(8080)
        Spark.defaultResponseTransformer(JsonResponseTransformer())

        Spark.get("/") { _, _ -> "Hello world" }

        Spark.path("/fruits") {
            Spark.get("") { req, res -> fruitsController.getFruits(req, res) }
            Spark.post("") { req, res -> fruitsController.createFruit(req, res) }
        }


    }
}