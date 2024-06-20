package com.springfamework.canteen.service;

import com.springfamework.canteen.model.OrderDetails;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrderDetailsServiceImplement implements OrderDetailsService{
    @Override
    public Optional<OrderDetails> Create(OrderDetails request) {
        return Optional.empty();
    }

    @Override
    public Optional<OrderDetails> getById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<OrderDetails> Update(UUID id, OrderDetails request) {
        return Optional.empty();
    }

    @Override
    public List<OrderDetails> getAll() {
        return List.of();
    }
}
