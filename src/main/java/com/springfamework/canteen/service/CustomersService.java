package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.CustomersDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface CustomersService {

    Optional<CustomersDto> Create(CustomersDto customer);
    Optional<CustomersDto> getById(UUID id);
    Optional<CustomersDto> Update(UUID id, CustomersDto customer);
    List<CustomersDto> getAll();

}
