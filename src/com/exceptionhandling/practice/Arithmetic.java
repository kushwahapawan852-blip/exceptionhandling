package com.exceptionhandling.practice;

public class Arithmetic {

  public static void main(String[] args) {
    int a = 5;
    int b = 0;
    try {
      int result = a / b;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("you can not divide by zero");
      e.printStackTrace();
    }

  }

}
