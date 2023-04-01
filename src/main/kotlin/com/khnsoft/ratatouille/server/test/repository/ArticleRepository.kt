package com.khnsoft.ratatouille.server.test.repository

import com.khnsoft.ratatouille.server.test.entity.ArticleEntity
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<ArticleEntity, Long> {

    fun findByTitle(title: String): ArticleEntity?

    fun findAllByOrderByAddedAtDesc(): Iterable<ArticleEntity>
}