package com.khnsoft.ratatouille.server.test.repository

import com.khnsoft.ratatouille.server.test.entity.ArticleEntity
import com.khnsoft.ratatouille.server.test.entity.UserEntity
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest(showSql = true)
class ArticleRepositoryTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val articleRepository: ArticleRepository,
) {

    @Test
    fun test1() {
        // given
        val user = entityManager.persist(UserEntity("Keich.Park", 24))
        val article = entityManager.persist(ArticleEntity("Book title", "Book content", user.id!!))

        // when
        val found = articleRepository.findByIdOrNull(article.id!!)

        // then
        assertThat(found).isEqualTo(article)
    }
}