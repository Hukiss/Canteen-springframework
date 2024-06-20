package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.CategoriesDto;

import java.util.List;
import java.util.Optional;

public class CategoriesServiceImplement implements CategoriesService {
    @Override
    public Optional<CategoriesDto> Create(CategoriesDto category) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoriesDto> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoriesDto> Update(CategoriesDto category) {
        return Optional.empty();
    }

    @Override
    public List<CategoriesDto> getAll() {
        return List.of();
    }
}
