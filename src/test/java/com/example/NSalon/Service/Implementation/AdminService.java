package com.example.NSalon.Service.Implementation;

import com.example.NSalon.Entity.Admin;
import com.example.NSalon.Entity.User;
import com.example.NSalon.Repository.AdminRepository;
import com.example.NSalon.Service.Implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminDetailsService extends UserServiceImpl {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Admin not found"));

        return new User(admin.getUsername(), admin.getPassword(), new ArrayList<>());
    }
}
