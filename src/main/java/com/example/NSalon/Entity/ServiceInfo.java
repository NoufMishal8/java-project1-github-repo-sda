package com.example.NSalon.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class ServiceInfo {
    private String ServiceName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ServiceID;
    private double ServiceCost;

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public Long getServiceID() {
        return ServiceID;
    }

    public void setServiceID(Long serviceID) {
        ServiceID = serviceID;
    }

    public double getServiceCost() {
        return ServiceCost;
    }

    public void setServiceCost(double serviceCost) {
        ServiceCost = serviceCost;
    }

    public ServiceInfo(String serviceName, Long serviceID, double serviceCost) {
        ServiceName = serviceName;
        ServiceID = serviceID;
        ServiceCost = serviceCost;
    }

    public ServiceInfo() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceInfo that = (ServiceInfo) o;
        return ServiceID == that.ServiceID && Double.compare(ServiceCost, that.ServiceCost) == 0 && Objects.equals(ServiceName, that.ServiceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ServiceName, ServiceID, ServiceCost);
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "ServiceName='" + ServiceName + '\'' +
                ", ServiceID=" + ServiceID +
                ", ServiceCost=" + ServiceCost +
                '}';
    }



    public double getCost() {
        return ServiceCost;
    }
}
