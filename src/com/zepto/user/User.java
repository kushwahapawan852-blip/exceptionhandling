package com.zepto.user;

public class User {


  public void createUser(String name, String userID) {
    String userId = null;
    try {
      // code to connect to db
      // open the connection to db
      int num = 100 / 0;

      String country = "In";
      System.out.println("User.createUser()...Starts");
      userId = name.substring(0, 5) + "123";
      System.out.println("User.createuser() user id is " + userId + "end");
    }

    catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("you can not divide a number by zero");

    } catch (NullPointerException e) {
      e.printStackTrace();
      System.out.println("name is null");
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("unknown exception..");
      e.printStackTrace();
    } finally {
      System.out.println("User.createuser() closing the connection to db...");
    }

  }
}
