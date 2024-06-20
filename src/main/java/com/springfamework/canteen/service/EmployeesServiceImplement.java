package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.EmployeesDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeesServiceImplement implements EmployeesService{
    @Override
    public Optional<EmployeesDto> Create(EmployeesDto employee) {
        return Optional.empty();
    }

    @Override
    public Optional<EmployeesDto> getById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<EmployeesDto> Update(UUID id, EmployeesDto employee) {
        return Optional.empty();
    }

    @Override
    public List<EmployeesDto> getAll() {
        return List.of();
    }
}
