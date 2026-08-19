package com.exceptionhandling.practice;

public class ArrayException {

  public static void main(String[] args) {
    int[] array = {10, 20, 30, 40};
    try {
      System.out.println(array[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("index is out of range");
      e.printStackTrace();
    }
  }

}
