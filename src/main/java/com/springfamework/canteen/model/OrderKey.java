package com.springfamework.canteen.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Embeddable
public class OrderKey {

    @Column(name = "product_id")
    private Products product;

    @Column(name = "order_id")
    private Order order;

}
