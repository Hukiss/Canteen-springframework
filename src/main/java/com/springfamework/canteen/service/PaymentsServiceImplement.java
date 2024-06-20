package com.springfamework.canteen.service;

import com.springfamework.canteen.DTO.PaymentsDto;

import java.util.List;
import java.util.Optional;

public class PaymentsServiceImplement implements PaymentsService{
    @Override
    public Optional<PaymentsDto> Create(PaymentsDto paymentsDto) {
        return Optional.empty();
    }

    @Override
    public Optional<PaymentsDto> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<PaymentsDto> Update(String id, PaymentsDto paymentsDto) {
        return Optional.empty();
    }

    @Override
    public List<PaymentsDto> getAll() {
        return List.of();
    }
}
