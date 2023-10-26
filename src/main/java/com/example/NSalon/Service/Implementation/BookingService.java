//package com.example.NSalon.Service.Implementation;
//
//import com.example.NSalon.DTO.BookingRequest;
//import com.example.NSalon.Entity.Booking;
//import com.example.NSalon.Entity.Customer;
//import com.example.NSalon.Entity.ServiceInfo;
//import com.example.NSalon.Entity.Staff;
//import com.example.NSalon.Repository.BookingRepository;
//import com.example.NSalon.Repository.CustomerRepository;
//import com.example.NSalon.Repository.ServiceRepository;
//import com.example.NSalon.Repository.StaffRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.Set;
//
//@Service
//public class BookingService {
//
//    @Autowired
//    private BookingRepository bookingRepository;
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Autowired
//    private ServiceRepository serviceRepository;
//
//    public Booking createBooking(BookingRequest bookingRequest) {
//        Customer customer = customerRepository.getOne(bookingRequest.getCustomerId());
//        ServiceInfo services = serviceRepository.getOne(bookingRequest.getServiceId());
//
//        Booking booking = new Booking();
//        booking.setCustomer(customer);
//        booking.setService((Set<ServiceInfo>) services);
//        booking.setBookingDateTime(bookingRequest.getBookingDateTime());
//
//
//        return bookingRepository.save(booking);
//    }
//}
//

