package com.example.NSalon.Service.Interface;

import com.example.NSalon.Entity.Customer;
import com.example.NSalon.Entity.User;

import java.util.List;

public interface CustomerServiceInterface{
    public List<Customer> getAllCustomers();

    public Customer addCustomer(Customer customer);
    String updateCustomer(int Customer_id,Customer customer);
    Customer patchCustomer(int Customer_id,Customer CustomerUpdate);
    void deleteCustomer(int Customer_id);

}
