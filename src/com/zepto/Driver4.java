package com.zepto;

public class Driver4 {

  public static void main(String[] args) {
    String name = args[0];
    try {
      System.out.println("Driver4.main() starts...");

      System.out.println("the first index is " + name.charAt(1));
      System.out.println("Driver4.main() ends....");
      Driver4 driver4 = new Driver4();
      driver4.doSomething();
    }

    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception : array index out of bound exception");
      e.printStackTrace();
    }
  }

  public void doSomething() {
    System.out.println("Driver4.doSomething() starts...");
    System.out.println("Driver4.doSomething()");
    System.out.println("Driver4.doSomething() ends..");
  }
}
