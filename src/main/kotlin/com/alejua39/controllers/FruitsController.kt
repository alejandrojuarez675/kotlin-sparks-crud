package com.alejua39.controllers

import spark.Request
import spark.Response

class FruitsController {

    fun createFruit(req: Request, res: Response): Unit {
        return
    }

    fun getFruits(req: Request, res: Response): List<String> {
        val arr: List<String> = listOf("apple", "banana", "orange")
        return arr
    }
}