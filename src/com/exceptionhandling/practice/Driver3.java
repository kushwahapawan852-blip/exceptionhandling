package com.exceptionhandling.practice;

public class Driver3 {

  public static void main(String[] args) {
    try {
      int marks = 55;
      if (marks < 35) {
        throw new IllegalArgumentException("you have failed");
      }
      System.out.println("you have passed");
    } catch (IllegalArgumentException e) {
      System.out.println("illegal");
      e.printStackTrace();
    }
  }

}
