package com.exceptionhandling.practice;

public class NumberFormatdemo {

  public static void main(String[] args) {
    // String s = "abc";
    try {
      int num = Integer.parseInt("abc");
      System.out.println(num);

    } catch (NumberFormatException e) {
      System.out.println("you cant change string to a number");
      e.printStackTrace();
    }
  }


}
