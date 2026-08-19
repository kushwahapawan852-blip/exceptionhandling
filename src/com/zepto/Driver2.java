package com.zepto;

public class Driver2 {

  public static void main(String[] args) {

    String name = null;

    try {
      System.out.println("Driver2.mains...Starts");

      System.out.println("the length of the name is " + name.length());

      System.out.println("Driver2.mains()...ends");

      Driver2 driver2 = new Driver2();
      driver2.doSomething();
    }

    catch (NullPointerException e) {
      System.out.println("Exception : the name is null");
      e.printStackTrace();
    }
    System.out.println("Driver2.main() 	end");
  }

  public void doSomething() {
    System.out.println("Driver2.dosomething() Starts..");
    System.out.println("Driver2.doSomething()");
    System.out.println("Driver2.doSomething() ends...");
  }
}
