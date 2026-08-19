package com.zepto;

class Employee {
  int id;
  String name;
  String location;

  public Employee(int id, String name, String location) {
    super();
    this.id = id;
    this.name = name;
    this.location = location;
    System.out.println("the id is " + id);
  }
}


public class Driver5 {

  public static void main(String[] args) {
    try {
      Employee employee = new Employee(102, "pawan", "banglore");
      System.out.println(employee.location);
      System.out.println(employee.name);
      String firstName = args[0];
      String lastName = args[1];
      System.out.println("the first character is " + firstName.charAt(0));
      System.out.println("the second character is " + lastName.charAt(1));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception : array index out of bound exception");
      e.printStackTrace();
    }

  }

}
