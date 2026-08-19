package com.practice.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class driver {

  public static void main(String[] args) {
    FileSearch filesearch = new FileSearch();
    try {
      filesearch.doFileSearch();
    } catch (FileNotFoundException e) {
      System.out.println("the msg is:::" + e.getMessage());
      e.printStackTrace();
    } catch (IOException e) {

      e.printStackTrace();
    }

  }

}
