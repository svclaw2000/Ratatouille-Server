package com.khnsoft.ratatouille.server.test.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class ArticleEntity(
    val title: String,
    val content: String,
    val authorId: Long,
    val addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue val id: Long? = null,
)