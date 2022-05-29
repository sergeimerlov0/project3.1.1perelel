package com.web.ms.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private String age;
}
