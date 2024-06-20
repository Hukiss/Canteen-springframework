package com.springfamework.canteen.service;

import com.springfamework.canteen.model.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface OrderDetailsService {

     Optional<OrderDetails> Create (OrderDetails request);
     Optional<OrderDetails> getById(UUID id);
     Optional<OrderDetails> Update(UUID id, OrderDetails request);
     List<OrderDetails> getAll();

}
