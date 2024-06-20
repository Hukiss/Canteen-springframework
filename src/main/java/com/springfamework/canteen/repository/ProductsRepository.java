package com.springfamework.canteen.repository;

import com.springfamework.canteen.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<Products, UUID> {

    Optional<Products> getByName(String name);

}
