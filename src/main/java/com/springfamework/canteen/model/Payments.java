package com.springfamework.canteen.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Calendar;

@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @Column(name = "payment_id", nullable = false)
    private Long id;

    @Column(name = "paymentdate", nullable = false)
    private LocalDate paymentdate;

    @ManyToOne()
    @JoinColumn(name = "customer_id", nullable = false)
    private Long customer;

    @Column(name = "amount", nullable = false)
    private Double amount;

}
