package com.coffee.shop.api.demo.utils

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import java.io.IOException
import javax.persistence.AttributeConverter

@Slf4j
class HashMapConverter : AttributeConverter<Map<String?, Any?>?, String?> {
    override fun convertToDatabaseColumn(customerInfo: Map<String?, Any?>?): String? {
        var customerInfoJson: String? = null
        try {
            customerInfoJson = objectMapper.writeValueAsString(customerInfo)
        } catch (e: JsonProcessingException) {
            log.error("JSON writing error", e)
        }
        return customerInfoJson
    }

    override fun convertToEntityAttribute(customerInfoJSON: String?): Map<String?, Any?>? {
        var customerInfo: Map<String?, Any?>? = null
        try {
            customerInfo = objectMapper.readValue(
                customerInfoJSON,
                object : TypeReference<Map<String?, Any?>?>() {})
        } catch (e: IOException) {
            log.error("JSON reading error", e)
        }
        return customerInfo
    }

    companion object {
        private val objectMapper = ObjectMapper()
        private val log = LoggerFactory.getLogger(Companion::class.java)
    }
}