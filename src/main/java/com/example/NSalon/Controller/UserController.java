package com.example.NSalon.Controller;

import com.example.NSalon.Entity.User;
import com.example.NSalon.Service.Implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/Nouf")
    public String welcome(){
        return "** Nouf is here **";
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userServiceImpl.getAllUsers();
        return ResponseEntity.ok(users);
    }


    @PostMapping("/users/add")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        try {
            User admin1 = userServiceImpl.addUser(user); // Call the method on the injected instance
            String message = "User Created Successfully";
            return ResponseEntity.status(HttpStatus.CREATED).body(message);
        } catch (Exception e) {
            String errorMessage = "User Not Created" + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

    @PutMapping("/users/update/{Userid}")
    public String updateUser (@PathVariable String Userid , @RequestBody User user){
        return userServiceImpl.updateUser(Userid,user);
    }
    @PatchMapping("/users/patchUser/{Userid}")
    public String patchUser(@PathVariable String Userid, @RequestBody User UserUpdate) {
        return userServiceImpl.patchUser(Userid, UserUpdate);
    }

    @DeleteMapping("/users/delete/{Userid}")
    public String deleteUser(@PathVariable String Userid) {
        userServiceImpl.deleteUser(Userid);
        return "User deleted";
    }

}