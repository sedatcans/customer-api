package com.sonat.customerapi.repository;

import com.sonat.customerapi.data.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
