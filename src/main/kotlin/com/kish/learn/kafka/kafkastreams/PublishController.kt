package com.kish.learn.kafka.kafkastreams

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PublishController(val publisher:KotlinProducer) {

    @GetMapping(value = arrayOf("/{message}"),produces = arrayOf(MediaType.TEXT_PLAIN_VALUE))
    fun publishMessage(@PathVariable(name = "message") msg:String):String {
        publisher.send(msg)
        return "published";
    }
}