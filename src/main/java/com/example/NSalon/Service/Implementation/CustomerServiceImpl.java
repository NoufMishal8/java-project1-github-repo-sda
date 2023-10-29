package com.example.NSalon.Service.Implementation;

import com.example.NSalon.Entity.Customer;
import com.example.NSalon.Repository.CustomerRepository;
import com.example.NSalon.Service.Interface.CustomerServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.NSalon.Entity.*;
import com.example.NSalon.Repository.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerServiceInterface {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public String updateCustomer(int Customer_id, Customer customer) {
        Optional<Customer> customerFound = customerRepository.findById(Customer_id);
        if(customerFound.isPresent()){
            customer.setCustomer_id(customer.getCustomer_id());
            //3.Save it in the dataBase
            customerRepository.save(customer);
            return "Customer details updated";
        }
        else
        {
            return "Customer with Customer Id " + Customer_id+"not found";
        }
    }


    public Customer patchCustomer(int Customer_id, Customer customerUpdate) {
        Customer existingCustomer = customerRepository.findById(Customer_id)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found"));

        if (customerUpdate.getCustomerName() != null) {
            existingCustomer.setCustomerName(customerUpdate.getCustomerName());
        }
        if (customerUpdate.getCustomerEmail() != null) {
            existingCustomer.setCustomerEmail(customerUpdate.getCustomerEmail());
        }

        return customerRepository.save(existingCustomer);
    }

    public void deleteCustomer(int Customer_id) {
        Customer existingCustomer = customerRepository.findById(Customer_id)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found"));

        customerRepository.delete(existingCustomer);
    }}