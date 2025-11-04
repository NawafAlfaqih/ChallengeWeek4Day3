package org.example.challengeweek4day3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;
import java.util.ArrayList;

@RestController
public class Controller {

    ArrayList<LocalDate> loginData = new ArrayList<>();
    ArrayList<LocalDate> logoutData = new ArrayList<>();
    ArrayList<LocalTime> loginTime = new ArrayList<>();
    ArrayList<LocalTime> logoutTime = new ArrayList<>();
    ArrayList<String> users = new ArrayList<>();
    int counter = 0;

    @GetMapping("/loginDate")
    public LocalDate loginDate() {

        LocalDate date = LocalDate.now();

        loginData.add(date);
        return date;
    }

    @GetMapping("/logoutDate")
    public LocalDate logoutDate() {
        LocalDate date = LocalDate.now();

        logoutData.add(date);

        return date;
    }

    @GetMapping("/loginDate/Data")
    public ArrayList<LocalDate> viewLoginDate() {
        return loginData;
    }

    @GetMapping("/logoutDate/Data")
    public ArrayList<LocalDate> viewLogoutDate() {
        return logoutData;
    }

    @GetMapping("/loginTime")
    public LocalTime loginTime() {

        LocalTime time = LocalTime.now();

        loginTime.add(time);
        return time;
    }

    @GetMapping("/logoutTime")
    public LocalTime logoutTime() {
        LocalTime time = LocalTime.now();

        logoutTime.add(time);

        return time;
    }

    @GetMapping("/loginTime/Data")
    public ArrayList<LocalTime> viewLoginTime() {
        return loginTime;
    }

    @GetMapping("/logoutTime/Data")
    public ArrayList<LocalTime> viewLogoutTime() {
        return logoutTime;
    }

    @GetMapping("/Users/Data")
    public ArrayList<String> viewUsers() {
        return users;
    }

    @GetMapping("/users/Data")
    public String addUser() {
        String user = "User "+(++counter);

        users.add(user);

        return user;
    }




}
