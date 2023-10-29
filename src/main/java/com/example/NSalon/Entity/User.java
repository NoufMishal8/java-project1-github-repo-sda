package com.example.NSalon.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.Objects;


@Entity
@Table(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)

public class User {
    @Id
    @GeneratedValue
    private String Userid;


    private String Username;
//        private String Email;
//        private String PhoneNumber;
@OneToOne(mappedBy = "user")
@JoinColumn(name = "Customer_id")
private Customer customers;

@OneToOne(mappedBy = "user")
@JoinColumn(name = "Admin_id")
private Admin admin;

@OneToOne(mappedBy = "user")
@JoinColumn(name = "Staff_id")
private Staff staff ;

    public <E> User(String username, String password, ArrayList<E> es) {
    }


    public String getUserid() {
            return Userid;
        }

        public void setUserid(String userid) {
            Userid = userid;
        }

        public String getUserName() {
            return Username;
        }

        public void setUserName(String username) {
            Username = username;
        }
//
//        public String getEmail() {
//            return Email;
//        }
//
//        public void setEmail(String email) {
//            Email = email;
//        }
//
//        public String getPhoneNumber() {
//            return PhoneNumber;
//        }
//
//        public void setPhoneNumber(String phoneNumber) {
//            PhoneNumber = phoneNumber;
//        }

//        public User(String userid, String username, String email, String phoneNumber) {
//            Userid = userid;
//            Username = username;
//            Email = email;
//            PhoneNumber = phoneNumber;
//        }

    public User(String userid , String username) {
        Userid = userid;
        Username = username;
    }

    public User() {
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Userid, user.Userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Userid);
    }

    @Override
    public String toString() {
        return "User{" +
                "Userid='" + Userid + '\'' +
                '}';
    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(Userid, user.Userid) && Objects.equals(Username, user.Username) && Objects.equals(Email, user.Email) && Objects.equals(PhoneNumber, user.PhoneNumber);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Userid, Username, Email, PhoneNumber);
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "Userid='" + Userid + '\'' +
//                ", Username='" + Username + '\'' +
//                ", Email='" + Email + '\'' +
//                ", PhoneNumber='" + PhoneNumber + '\'' +
//                '}';
//    }
}
