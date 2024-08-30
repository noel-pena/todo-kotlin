package com.example.todolist.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["com.example.todolist.repository"])
class MongoConfig {
    // No need to extend AbstractMongoClientConfiguration for now
}