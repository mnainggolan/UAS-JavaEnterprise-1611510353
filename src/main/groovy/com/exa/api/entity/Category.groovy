package com.exa.api.entity

import javax.persistence.*
import javax.validation.constraints.NotNull
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "categories")
class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    String namabk

    @NotNull
    @Column(nullable = false)
    String ketbk

    public Category() {}
    
    Category(Integer id) {
        this.id = id
    }
}