package com.springfamework.canteen.DTO;

import com.springfamework.canteen.model.Customers;
import com.springfamework.canteen.model.Employees;

import java.time.LocalDate;
import java.util.UUID;

public class OrderDto {

    private UUID id;
    private LocalDate orderData;
    private Double total;
    private Employees employee;
    private Customers customers;

}
