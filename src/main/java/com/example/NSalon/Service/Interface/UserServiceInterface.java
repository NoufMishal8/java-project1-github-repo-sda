package com.example.NSalon.Service.Interface;

import com.example.NSalon.Entity.User;

import java.util.List;

public interface UserServiceInterface {

    public List<User> getAllUsers();

    public User addUser(User user);
    String updateUser(String Userid, User user);
    String patchUser(String Userid, User UserUpdate);
    void deleteUser(String Userid);
}
