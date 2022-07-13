package com.alejua39.utils

import com.google.gson.Gson
import spark.ResponseTransformer

class JsonResponseTransformer : ResponseTransformer {

    private val gson = Gson()

    override fun render(model: Any?) = gson.toJson(model)

}