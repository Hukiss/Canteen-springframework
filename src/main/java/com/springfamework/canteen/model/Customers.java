package com.springfamework.canteen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customers extends Person{

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "order_id")
    private List<Order> orders;

    @OneToMany(mappedBy = "payment_id")
    private List<Payments> payments;

}
