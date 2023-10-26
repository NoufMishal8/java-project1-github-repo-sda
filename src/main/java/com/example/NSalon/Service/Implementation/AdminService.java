//package com.example.NSalon.Service.Implementation;
//
//import com.example.NSalon.Entity.Admin;
//import com.example.NSalon.Entity.User;
//import com.example.NSalon.Repository.AdminRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AdminService implements UserDetailsService {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        Admin admin = adminRepository.findByUsername(username);
//        if (admin == null) {
//            throw new UsernameNotFoundException("Admin not found");
//        }
//        return User.withUsername(admin.getUsername())
//                .password(admin.getPassword())
//                .roles("ADMIN")
//                .build();
//    }
//    }