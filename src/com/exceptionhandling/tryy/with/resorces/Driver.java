package com.exceptionhandling.tryy.with.resorces;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {
  public static void main(String[] args) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));) {
      System.out.println("Driver.main()");

    } catch (IOException | NullPointerException | ArithmeticException e) {
      e.printStackTrace();
      // } catch (IOException e) {
      // e.printStackTrace();
      // }
    } // exception should not be related, they should not be parent and child


  }
}
