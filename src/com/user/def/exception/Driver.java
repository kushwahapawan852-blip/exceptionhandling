package com.user.def.exception;

public class Driver {

  public static void main(String[] args) {
    Registration registration = new Registration();
    try {
      registration.doRegistration("pawan@123");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
