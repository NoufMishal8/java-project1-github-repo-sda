package com.example.NSalon.Repository;

import com.example.NSalon.Entity.ServiceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceInfo, Long> {

    List<ServiceInfo> findAll();
}
