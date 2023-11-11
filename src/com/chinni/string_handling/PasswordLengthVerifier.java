package com.chinni.string_handling;

import java.util.Scanner;

public class PasswordLengthVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        if (s1.isEmpty())
            System.out.println("Please enter some password ");

        if ((s1.length() < 8) || (s1.length() > 16))
            System.out.println("enter the password  in between 8 to 16 characters");
        System.out.println("Registration Sucessful");

    }
}