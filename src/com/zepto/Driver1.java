package com.zepto;

public class Driver1 {

  public static void main(String[] args) {

    System.out.println("Driver1.main()..starts");

    try {
      String name = null;
      System.out.println("the length of the name is " + name.length());

      Driver1 driver1 = new Driver1();
      driver1.doSomething();

    }

    catch (NullPointerException e) {
      System.out.println("Exception : name is null");
      e.printStackTrace();
    }
    System.out.println("driver1,main()..ends");

  }

  public void doSomething() {
    System.out.println("Driver1.doSomething ..starts");
    System.out.println("Driver1.doSomething()");
    System.out.println("Driver1.doSomething .. ends ");


  }

}
