package com.todolist.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Item(
    @Id val id: String? = null,
    val title: String
)