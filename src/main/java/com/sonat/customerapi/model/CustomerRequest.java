package com.sonat.customerapi.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Valid
public class CustomerRequest {
    private String name;
    private String surname;
    @Email(message = "Please provide a valid email address.")
    private String email;
    private String phone;
    
}
