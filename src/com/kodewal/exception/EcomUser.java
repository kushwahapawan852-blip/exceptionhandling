package com.kodewal.exception;

public class EcomUser {

  public static void main(String[] args) {
    EcomOrder order = new EcomOrder();
    try {
      order.doPlaceOrder("cycle", -2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
