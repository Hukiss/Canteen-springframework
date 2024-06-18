package com.springfamework.canteen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public abstract class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone")
    private int phoneNumber;

}
