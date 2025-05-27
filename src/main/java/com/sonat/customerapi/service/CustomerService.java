package com.sonat.customerapi.service;

import java.util.List;

import com.sonat.customerapi.data.Customer;
import com.sonat.customerapi.model.CustomerRequest;
import com.sonat.customerapi.model.dto.CustomerDto;
import com.sonat.customerapi.repository.CustomerRepository;
import com.sonat.customerapi.util.MaskingUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer create(CustomerRequest customerRequest) {
        return customerRepository.save(
                Customer.builder()
                        .email(customerRequest.getEmail())
                        .name(customerRequest.getName())
                        .surname(customerRequest.getSurname())
                        .phone(customerRequest.getPhone()).build()
        );
    }

    public List<CustomerDto> getMaskedCustomers() {
        return customerRepository.findAll().stream().map(Customer::toDto)
                .map(customerDto -> customerDto
                        .withName(MaskingUtils.mask(customerDto.name()))
                        .withSurname(MaskingUtils.mask(customerDto.surname()))
                )
                .toList();
    }
}
