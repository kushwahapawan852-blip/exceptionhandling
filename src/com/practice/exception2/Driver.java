package com.practice.exception2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {

  public static void main(String[] args) {
    BankService bank = new BankService();
    try {
      bank.downloadStatement();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
