package com.example.NSalon.Entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

import java.util.Objects;


@Entity
    @Table(name = "User")
    public class User {
        @Id
        private String Userid;
        private String Username;
        private String Email;
        private String PhoneNumber;

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

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public User(String userid, String username, String email, String phoneNumber) {
            Userid = userid;
            Username = username;
            Email = email;
            PhoneNumber = phoneNumber;
        }

        public User() {
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Userid, user.Userid) && Objects.equals(Username, user.Username) && Objects.equals(Email, user.Email) && Objects.equals(PhoneNumber, user.PhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Userid, Username, Email, PhoneNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "Userid=" + Userid +
                "UserName" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}