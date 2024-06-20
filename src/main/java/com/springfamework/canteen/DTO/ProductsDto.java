package com.springfamework.canteen.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class ProductsDto {

    private UUID id;
    private String name;
    private String description;
    private Double price;

}
