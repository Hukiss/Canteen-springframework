package com.springfamework.canteen.service;

import com.springfamework.canteen.model.Orders;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface OrdersService {

    Optional<Orders> Create(Orders request);
    Optional<Orders> getById(UUID id);
    Optional<Orders> Update(UUID id, Orders request);
    List<Orders> getAll();

}
