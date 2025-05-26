package com.sonat.customerapi.model.dto;

import lombok.Builder;

@Builder
public record CustomerDto(Long id, String name, String surname, String email, String phone) {
    public CustomerDto withName(String newName) {
        return new CustomerDto(this.id, newName, this.surname, this.email, this.phone);
    }

    public CustomerDto withSurname(String newSurname) {
        return new CustomerDto(this.id, this.name, newSurname, this.email, this.phone);
    }

    public CustomerDto withEmail(String newEmail) {
        return new CustomerDto(this.id, this.name, this.surname, newEmail, this.phone);
    }

    public CustomerDto withPhone(String newPhone) {
        return new CustomerDto(this.id, this.name, this.surname, this.email, newPhone);
    }
}
