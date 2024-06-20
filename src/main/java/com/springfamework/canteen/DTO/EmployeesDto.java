package com.springfamework.canteen.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Setter @Getter @NoArgsConstructor
public class EmployeesDto {

    private UUID id;
    private LocalDate dataPayment;
    private Double amount;

}
