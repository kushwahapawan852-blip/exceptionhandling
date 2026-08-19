package com.zepto;

public class Driver {

  public static void main(String[] args) {
    System.out.println("Driver.main()..starts");
    // String name = args[0];
    // String name = null;
    String name = "pawan";
    System.out.println("the lenth of the string is " + name.length());
    System.out.println("Driver.main() ends here...");
    Driver driver = new Driver();
    driver.doSomething();

  }

  public void doSomething() {

    System.out.println("Driver.dosomething() satrts...");
    System.out.println("Driver.dosomething()...");
    System.out.println("Driver.doSomething() ends..");
  }
}
