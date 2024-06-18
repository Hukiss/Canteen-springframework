package com.springfamework.canteen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "orderdate", nullable = false)
    private LocalDate orderdate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customer;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employees employee;

    @Column(name = "total", nullable = false)
    private Double total;

}
