package com.Farahnaz;

import com.Farahnaz.model.User;

public class Main {
    public static void main(String[] args) {

        String email = "farahnaz@example.com";
        String password = "mypassword";

        // هش کردن پسورد ساده (فعلاً برای نمایش)
        String passwordHash = Integer.toString(password.hashCode());
        User user=new User(email, passwordHash); // ایمیل و پسورد نمونه

        // چاپ اطلاعات User
        System.out.println("User ID: " + user.getId() +"\n Email: " + user.getEmail() +"\n Password Hash: " +
                user.getPasswordHash() + "\n Created At: " + user.getCreatedAt());
    }
}