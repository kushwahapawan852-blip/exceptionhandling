package com.zepto;

public class Driver3 {

  public static void main(String[] args) {
    try {
      int amount = 500;
      int result = amount / 0;
      System.out.println("the amount is " + result);
    }

    catch (ArithmeticException e) {

      System.out.println("Exception : the number is divided by zero");
      e.printStackTrace();
    }
  }

}
