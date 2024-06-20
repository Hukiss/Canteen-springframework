package com.springfamework.canteen.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter @Getter @NoArgsConstructor
public class CustomersDto {

    private UUID id;
    private String name;
    private String email;
    private String address;
    private String phone;

}
