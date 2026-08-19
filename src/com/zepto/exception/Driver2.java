package com.zepto.exception;

public class Driver2 {

  public static void main(String[] args) {

    try {
      int result = 10 / 0;
    } catch (Exception e) {
      System.out.println(e);

    }

  }

}
