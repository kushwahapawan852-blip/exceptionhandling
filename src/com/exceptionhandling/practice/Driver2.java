package com.exceptionhandling.practice;

public class Driver2 {

  public static void main(String[] args) {
    try {
      // int[] arr = {10, 20};
      // System.out.println(arr[5]);
      String name = null;
      System.out.println(name.length());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array");
      e.printStackTrace();
    } catch (RuntimeException e) {
      System.out.println("runtime");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Exception");
      e.printStackTrace();
    }

  }

}
