package com.exceptionhandling.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    try {
      int age = sc.nextInt();
      System.out.println("your age is :" + age);
    } catch (InputMismatchException e) {
      System.out.println("you have entered an invalid age");
      e.printStackTrace();
    }

  }
}
