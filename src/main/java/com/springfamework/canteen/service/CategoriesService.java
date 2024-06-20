package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.CategoriesDto;

import java.util.List;
import java.util.Optional;

public interface CategoriesService {

    Optional<CategoriesDto> Create(CategoriesDto category);
    Optional<CategoriesDto> getById(String id);
    Optional<CategoriesDto> Update(CategoriesDto category);
    List<CategoriesDto> getAll();

}
