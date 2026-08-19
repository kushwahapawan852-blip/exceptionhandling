package com.exceptionhandling.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
  public static void readFile() throws FileNotFoundException {
    FileReader fr = new FileReader("abc.txt");
  }

  public static void main(String[] args) {
    try {
      readFile();
    } catch (FileNotFoundException e) {
      System.out.println("messege : file is not found ");
      e.printStackTrace();
    }
  }

}
