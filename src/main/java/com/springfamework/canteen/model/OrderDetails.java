package com.springfamework.canteen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;

@Entity
@Table(name = "orderdetails")
@Data
public class OrderDetails {

    @ManyToOne
    @JoinColumn(
            name = "orderproduct_id",
            referencedColumnName = "product_id"
    )
    @JoinColumn(
            name = "data_id",
            referencedColumnName = "data"
    )
    private OrderKey orderKey;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column
    private int quantity;

}
