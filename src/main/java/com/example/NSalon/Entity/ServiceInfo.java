package com.example.NSalon.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Services")
public class ServiceInfo {
    private String ServiceName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Service_id;
    private double ServiceCost;

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public Long getServiceID() {
        return Service_id;
    }

    public void setServiceID(Long serviceID) {
        Service_id = serviceID;
    }

    public double getServiceCost() {
        return ServiceCost;
    }

    public void setServiceCost(double serviceCost) {
        ServiceCost = serviceCost;
    }

    public ServiceInfo(String serviceName, Long service_id, double serviceCost) {
        ServiceName = serviceName;
        Service_id = service_id;
        ServiceCost = serviceCost;
    }

    public ServiceInfo() {
    }

    @ManyToMany(mappedBy = "services")
    private List<Booking> bookins;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceInfo that = (ServiceInfo) o;
        return Service_id == that.Service_id && Double.compare(ServiceCost, that.ServiceCost) == 0 && Objects.equals(ServiceName, that.ServiceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ServiceName, Service_id, ServiceCost);
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "ServiceName='" + ServiceName + '\'' +
                ", ServiceID=" + Service_id +
                ", ServiceCost=" + ServiceCost +
                '}';
    }



    public double getCost() {
        return ServiceCost;
    }
}
