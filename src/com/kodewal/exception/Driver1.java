package com.kodewal.exception;

public class Driver1 {

  public static void main(String[] args) {
    try {
      Class.forName("com.kodewal.exception");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("class not found " + e);
    }
  }

}
