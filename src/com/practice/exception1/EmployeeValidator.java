package com.practice.exception1;

import java.io.IOException;

public class EmployeeValidator {
  public static void validateEmployee(int id) throws IOException {
    if (id <= 0) {
      throw new IOException("the msg is :: employee id is invalid, you can not use -ve");
    }
    System.out.println("employee id is valid ");
  }

}
