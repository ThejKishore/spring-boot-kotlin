package com.kish.learn.kafka.kafkastreams

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties(CustomConfigs::class)
class KafkaStreamsApplication{

    @Bean
    fun run():CommandLineRunner{
        return  CommandLineRunner {
            println(" calling  ")
        };
    }

}

fun main(args: Array<String>) {
    runApplication<KafkaStreamsApplication>(*args)
}
