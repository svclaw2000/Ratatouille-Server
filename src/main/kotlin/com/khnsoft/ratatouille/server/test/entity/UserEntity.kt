package com.khnsoft.ratatouille.server.test.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class UserEntity(
    val name: String,
    val age: Int,
    @Id @GeneratedValue val id: Long? = null,
)