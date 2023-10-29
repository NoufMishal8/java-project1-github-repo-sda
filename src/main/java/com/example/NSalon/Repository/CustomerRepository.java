package com.example.NSalon.Repository;

import com.example.NSalon.Entity.Booking;
import com.example.NSalon.Entity.Customer;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface CustomerRepository {

    Customer getOne(Long customerId);
    Optional<Customer> findById(int Customer_id);
}
