package com.kodewal.exception;

public class EcomOrder {
  public void doPlaceOrder(String item, int quantity) throws Exception, NullPointerException {
    if (quantity < 0) {
      quantity = 0;
      throw new Exception("negative quantity is not allowed");
    } else {
      System.out.println("order placed successfull");
      System.out.println("the item is: " + item);
      System.out.println("the quantity is : " + quantity);
    }
  }

}
