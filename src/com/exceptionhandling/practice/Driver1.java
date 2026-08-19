package com.exceptionhandling.practice;

public class Driver1 {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    int[] array = {10, 20, 30};
    try {
      int result = a / b;
      System.out.println("the result is: " + result);
      System.out.println(array[5]);
    } catch (ArithmeticException e) {
      System.out.println("you can not divide a number by zero");
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("the index is out of range");
      e.printStackTrace();
    }


  }

}
