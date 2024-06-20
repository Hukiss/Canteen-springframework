package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.CustomersDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CustomersServiceImplement implements CustomersService{

    @Override
    public Optional<CustomersDto> Create(CustomersDto customer) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomersDto> getById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomersDto> Update(UUID id, CustomersDto customer) {
        return Optional.empty();
    }

    @Override
    public List<CustomersDto> getAll() {
        return List.of();
    }
}
