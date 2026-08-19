package com.practice.exception1;

import java.io.IOException;

public class Driver {

  public static void main(String[] args) {
    EmployeeValidator emp = new EmployeeValidator();
    try {
      emp.validateEmployee(-5);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }

    System.out.println("program end");
  }

}
