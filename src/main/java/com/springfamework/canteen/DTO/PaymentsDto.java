package com.springfamework.canteen.DTO;

import com.springfamework.canteen.model.Customers;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class PaymentsDto {

    private UUID id;
    private LocalDate dataPayment;
    private Double amount;
    private Customers customers;

}
