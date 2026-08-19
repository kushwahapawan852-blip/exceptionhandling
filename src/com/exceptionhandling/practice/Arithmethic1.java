package com.exceptionhandling.practice;

import java.util.Scanner;

public class Arithmethic1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number ");
    int a = sc.nextInt();
    System.out.println("enter 2nd number ");
    int b = sc.nextInt();
    try {
      int result = a / b;
      System.out.println("the result is : " + result);
    } catch (ArithmeticException e) {
      System.out.println("you can not divide by zero");
      e.printStackTrace();
    }
    sc.close();
  }

}
