package com.springfamework.canteen.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private LocalDate orderData;

    @Column(nullable = false)
    private Double total;

    @ManyToOne
    @JoinColumn(name =  "employee_id")
    private Employees employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    @OneToMany(mappedBy = "id")
    private List<OrderDetails> orderDetails;

}
