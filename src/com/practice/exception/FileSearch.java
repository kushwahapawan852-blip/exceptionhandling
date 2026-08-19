package com.practice.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileSearch {
  public void doFileSearch() throws FileNotFoundException, IOException {

    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
    throw new FileNotFoundException("file is not found");
  }
}
