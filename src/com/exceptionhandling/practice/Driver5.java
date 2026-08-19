package com.exceptionhandling.practice;

import java.util.Scanner;

public class Driver5 {
  public static void checkAge(int age) {

    if (age < 18) {
      throw new IllegalArgumentException("Age must be 18 or above");
    }
    System.out.println("Eligible");



  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = sc.nextInt();
    try {
      checkAge(15);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());

    }
  }

}
