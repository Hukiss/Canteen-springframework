package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.EmployeesDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface EmployeesService {

     Optional<EmployeesDto> Create(EmployeesDto employee);
     Optional<EmployeesDto> getById(UUID id);
     Optional<EmployeesDto> Update(UUID id, EmployeesDto employee);
     List<EmployeesDto> getAll();

}
