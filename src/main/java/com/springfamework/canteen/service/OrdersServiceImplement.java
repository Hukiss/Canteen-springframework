package com.springfamework.canteen.service;

import com.springfamework.canteen.model.Orders;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrdersServiceImplement implements OrdersService{

    @Override
    public Optional<Orders> Create(Orders request) {
        return Optional.empty();
    }

    @Override
    public Optional<Orders> getById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Orders> Update(UUID id, Orders request) {
        return Optional.empty();
    }

    @Override
    public List<Orders> getAll() {
        return List.of();
    }
}
