package com.example.NSalon.Service.Implementation;

import com.example.NSalon.Entity.User;
import com.example.NSalon.Repository.UserRepository;
import com.example.NSalon.Service.Interface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceInterface {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public String updateUser(String Userid, User user) {
        //Find the ID
        Optional<User> courseFound = userRepository.findById(Userid);
        if(courseFound.isPresent()){
            //2.Update the courseName
            user.setUserName(user.getUserName());
            //3.Save it in the dataBase
            userRepository.save(user);
            return "User details updated";
        }
        else
        {
            return "User with User Id " + Userid+"not found";
        }
    }

}


