//package com.example.NSalon.Entity;
//
//import java.util.List;
//import java.util.Objects;
//
//public class NoBookingsFoundException extends RuntimeException {
//    public NoBookingsFoundException(String message) {
//        super(message);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        NoBookingsFoundException that = (NoBookingsFoundException) o;
//        return Objects.equals(services, that.services);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(services);
//    }
//
//    private List<ServiceInfo> services;
//
//    public double getTotalCost() {
//        double totalCost = 0.0;
//
//        for (ServiceInfo service : services) {
//            totalCost += service.getCost();
//        }
//
//
//        return totalCost;
//    }
//}
