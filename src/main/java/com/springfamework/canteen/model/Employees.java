package com.springfamework.canteen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "employees")
public class Employees extends Person{

    @Column(name = "salary")
    private double salary;

    @OneToMany(mappedBy = "order_id")
    private List<Order> sales;
}
