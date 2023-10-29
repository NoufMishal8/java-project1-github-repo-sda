package com.example.NSalon.Controller;

import com.example.NSalon.Entity.Booking;
import com.example.NSalon.Entity.Customer;
import com.example.NSalon.Entity.ServiceInfo;
import com.example.NSalon.Entity.User;
import com.example.NSalon.Repository.ServiceRepository;
import com.example.NSalon.Service.Implementation.BookingService;
import com.example.NSalon.Service.Implementation.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;



    @GetMapping("/Customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }


    @PostMapping("/Customers/add")
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
        try {
            Customer customer1 = customerService.addCustomer(customer);
            String message = "Customer Created Successfully";
            return ResponseEntity.status(HttpStatus.CREATED).body(message);
        } catch (Exception e) {
            String errorMessage = "Customer Not Created" + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

    @PutMapping("/customers/update/{Customer_id}")
    public String updateCustomer (@PathVariable int Customer_id , @RequestBody Customer customer){
        return customerService.updateCustomer(Customer_id,customer);
    }
    @PatchMapping("/customers/patch/{Customer_id}")
    public Customer patchCustomer(@PathVariable   int Customer_id, @RequestBody Customer CustomerUpdate) {
        return customerService.patchCustomer( Customer_id, CustomerUpdate);
    }
    @DeleteMapping("/customers/delete/{Customer_id}")
    public String deleteCustomer(@PathVariable int Customer_id) {
        customerService.deleteCustomer(Customer_id);
        return "Customer deleted";
    }
}