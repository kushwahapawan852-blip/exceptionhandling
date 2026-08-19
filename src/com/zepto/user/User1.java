package com.zepto.user;

public class User1 {

  public void createUserId(String name, String password) {
    String userId = null;
    try {
      String country = "In";
      int num = 100 / 0;
      String s = "pawan";
      System.out.println(s.charAt(7));
      System.out.println("User1.createUserId()..starts");
      userId = userId.substring(2, 5) + "123";
      System.out.println("the generated user id is : " + userId);
      System.out.println("the country is " + country);
      System.out.println("the number is " + num);
      System.out.println("User1.createUserId()..ends");
    } catch (ArithmeticException e) {
      System.out.println("Exception: you can not divide a number by zero");
      e.printStackTrace();
    } catch (NullPointerException e) {
      System.out.println("you can not provide a null name ");
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array index out of bound");
      e.printStackTrace();
    }
  }

}
