package com.example.mvi_loginapp.utils

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.PropertyAccessor
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.kotlinModule
import com.fasterxml.jackson.module.kotlin.readValue

val jackson: ObjectMapper by lazy {
    ObjectMapper()
        .registerModule(kotlinModule { configure(KotlinFeature.SingletonSupport, true) })
        .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
}

fun Any.toJSON(): String = jackson.writeValueAsString(this)

inline fun <reified T> fromJSON(json: String): T = jackson.readValue(json)
