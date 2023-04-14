package com.solvd.ta.laba;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        System.out.println("Your Name is " + name + ", you are " + age + " old and you live in " + city);
    }
}
