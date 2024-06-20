package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.ProductsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductsService {

    Optional<ProductsDto> Create(ProductsDto product);
    Optional<ProductsDto> getById(String id);
    Optional<ProductsDto> Update(ProductsDto product);
    List<ProductsDto> getAll();

}
