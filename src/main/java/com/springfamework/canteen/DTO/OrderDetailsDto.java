package com.springfamework.canteen.DTO;

import com.springfamework.canteen.model.Products;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Setter @Getter @NoArgsConstructor
public class OrderDetailsDto {

    private UUID id;
    private LocalDate orderDatailDate;
    private int quantity;
    private Products products;
    private OrderDto order;

}
