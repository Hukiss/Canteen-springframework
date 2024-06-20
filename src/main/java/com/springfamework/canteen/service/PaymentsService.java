package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.PaymentsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PaymentsService {

    Optional<PaymentsDto> Create(PaymentsDto paymentsDto);
    Optional<PaymentsDto> getById(String id);
    Optional<PaymentsDto> Update(String id, PaymentsDto paymentsDto);
    List<PaymentsDto> getAll();

}
