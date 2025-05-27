package com.sonat.customerapi.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import com.sonat.customerapi.model.CustomerRequest;
import com.sonat.customerapi.model.dto.CustomerDto;
import com.sonat.customerapi.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(code = OK)
    public CustomerDto createCustomer(@Valid @RequestBody CustomerRequest customerRequest) {
        return customerService.create(customerRequest).toDto();
    }

    @GetMapping("masked")
    @ResponseStatus(code = OK)
    public List<CustomerDto> getMaskedCustomers() {
        return customerService.getMaskedCustomers();
    }

}
