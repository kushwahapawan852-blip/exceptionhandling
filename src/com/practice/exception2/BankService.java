package com.practice.exception2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankService {
  public static void downloadStatement() throws FileNotFoundException, IOException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.txt"));
    throw new FileNotFoundException("unable to connect the server");
  }

}
