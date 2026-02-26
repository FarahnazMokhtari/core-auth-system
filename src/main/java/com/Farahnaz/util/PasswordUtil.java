package com.Farahnaz.util;

public class PasswordUtil {
   public static String hash(String password){
       if (password == null) {
           throw new IllegalArgumentException("Password cannot be null");
       }
       return Integer.toString(password.hashCode());
    }

    //--------------------------for checking password match------------------

    public static boolean matches(String rawPassword, String storedHash) {
        return hash(rawPassword).equals(storedHash);
    }
}
