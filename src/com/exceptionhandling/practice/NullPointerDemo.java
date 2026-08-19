package com.exceptionhandling.practice;

public class NullPointerDemo {

  public static void main(String[] args) {

    String name = null;
    try {
      System.out.println(name.length());
    } catch (NullPointerException e) {
      System.out.print("String reference is null");
      System.out.println("you can not perform any operations on null");
      e.printStackTrace();
    }
  }

}
