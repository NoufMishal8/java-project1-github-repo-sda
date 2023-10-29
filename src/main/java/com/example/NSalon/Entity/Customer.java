package com.example.NSalon.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "Customers")
public class Customer extends User {

    @Id
    @GeneratedValue
    private int Customer_id;
    @OneToOne
    @JoinColumn(name = "User_id")
    private User users ;
    private String CustomerName;
    private String CustomerPhoneNumber;
    private String CustomerEmail ;

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int customer_id) {
        Customer_id = customer_id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public Customer(String Userid,String Username , int customer_id, String customerName, String customerPhoneNumber, String customerEmail) {
        super(Userid , Username);
        Customer_id = customer_id;
        CustomerName = customerName;
        CustomerPhoneNumber = customerPhoneNumber;
        CustomerEmail = customerEmail;
    }

    public Customer(String userid , String username) {
        super(userid , username );
    }
@OneToMany(mappedBy = "customers")
    private List<Booking> bookings;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Customer_id == customer.Customer_id && Objects.equals(CustomerName, customer.CustomerName) && Objects.equals(CustomerPhoneNumber, customer.CustomerPhoneNumber) && Objects.equals(CustomerEmail, customer.CustomerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Customer_id, CustomerName, CustomerPhoneNumber, CustomerEmail);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer_id=" + Customer_id +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerPhoneNumber='" + CustomerPhoneNumber + '\'' +
                ", CustomerEmail='" + CustomerEmail + '\'' +
                '}';
    }

    public void checkServices() {
    }

    public void editBooking() {
    }

    public void bookAService() {
    }
}
