package spring_and_springboot.Ex1;
// package com.model;

import java.util.List;
import java.util.Map;

public class User {

    int userId;

    String name;

    List<Integer> skills;

    Map<String, String> hobbies;

    public User() {

    }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSkills() {
        return skills;
    }

    public void setSkills(List<Integer> skills) {
        this.skills = skills;
    }

    public Map<String, String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Map<String, String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
