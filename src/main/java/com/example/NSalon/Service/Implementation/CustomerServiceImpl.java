//package com.example.NSalon.Service.Implementation;
//
//import com.example.NSalon.Entity.Role;
//import com.example.NSalon.Entity.ServiceInfo;
//import com.example.NSalon.Entity.User;
//import com.example.NSalon.Repository.ServiceRepository;
//import com.example.NSalon.Repository.UserRepository;
//import com.example.NSalon.Service.Interface.CustomerServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//
//public class CustomerServiceImpl implements CustomerServiceInterface {
//
//    @Autowired
//    private ServiceRepository serviceInfoRepository;
//
//
//
//    @Autowired
//    private UserRepository userRepository;
//
////    @Override
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        User user = userRepository.findByUsername(username);
////        if (user == null) {
////            throw new UsernameNotFoundException("User not found");
////        }
//
////        Set<Role> roles = Admin.getRoles();
//
////        List<GrantedAuthority> authorities = new ArrayList<>();
////        for (Role role : roles) {
////            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
////        }
////
////        return new org.springframework.security.core.userdetails.User(
////                user.getUserName(),
////                user.getPassword(),
////                authorities
////        );
////    }
//
//
////    public List<ServiceInfo> getAvailableServices() {
////        List<ServiceInfo> availableServices = serviceInfoRepository.findAll(); // You might have specific criteria for selecting services
////        return availableServices;
////    }
//
//}
