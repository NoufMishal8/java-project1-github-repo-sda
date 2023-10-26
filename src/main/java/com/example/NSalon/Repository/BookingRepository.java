//package com.example.NSalon.Repository;
//
//import com.example.NSalon.Entity.Booking;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDateTime;
//
//@Repository
//public interface BookingRepository extends JpaRepository<Booking, Long> {
//    // Your standard repository methods for CRUD operations
//
//    @Query(value = "INSERT INTO Booking (customer_id, staff_id, booking_date_time, notes) " +
//            "VALUES (:customerId, :staffId, :bookingDateTime, :notes)", nativeQuery = true)
//    void createBooking(@Param("customerId") Long customerId, @Param("staffId") Long staffId,
//                       @Param("bookingDateTime") LocalDateTime bookingDateTime, @Param("notes") String notes);
//}