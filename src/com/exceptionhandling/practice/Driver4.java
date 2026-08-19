package com.exceptionhandling.practice;

public class Driver4 {

  public static void main(String[] args) {
    try {
      int age = 15;
      if (age <= 18) {
        throw new IllegalArgumentException("invalid age");
      }
      System.out.println("hello");
    } catch (IllegalArgumentException e) {
      System.out.println("caught");

    }

  }

}
