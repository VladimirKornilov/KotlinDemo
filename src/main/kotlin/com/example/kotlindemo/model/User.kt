package com.example.kotlindemo.model

import javax.persistence.*

@Entity
@Table(name = "kt_user")
class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String

)