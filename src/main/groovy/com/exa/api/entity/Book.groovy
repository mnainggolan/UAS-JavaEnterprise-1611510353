package com.exa.api.entity

import javax.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.validation.constraints.NotNull

@Entity
@Table(name = "books")
class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    String kodebk

    @NotNull
    @Column(nullable = false)
    String namabk

    @NotNull
    @Column(nullable = false)
    String noseribk

    @NotNull
    @Column(nullable = false)
    String ketbk

    @NotNull
    @Column(nullable = false)
    Integer jmlbk
    
    @ManyToOne
    @JoinColumn(name = "idkatbk")
    Category category

}