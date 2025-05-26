package com.sonat.customerapi.data;

import com.sonat.customerapi.model.dto.CustomerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public CustomerDto toDto() {
        return CustomerDto.builder().id(id).name(name).surname(surname).email(email).phone(phone).build();
    }
}
