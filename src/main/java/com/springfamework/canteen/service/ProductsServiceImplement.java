package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.ProductsDto;

import java.util.List;
import java.util.Optional;

public class ProductsServiceImplement implements ProductsService{
    @Override
    public Optional<ProductsDto> Create(ProductsDto product) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductsDto> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductsDto> Update(ProductsDto product) {
        return Optional.empty();
    }

    @Override
    public List<ProductsDto> getAll() {
        return List.of();
    }
}
