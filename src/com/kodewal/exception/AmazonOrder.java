package com.kodewal.exception;

public class AmazonOrder {
  public void doPlaceOrder(String item, int qty) {
    int quantity = 1;
    try {
      if (quantity < 0)
        System.out.println("quantity : ");
    } catch (ArithmeticException e) {
      System.out.println("you have given negative qunatity");
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    AmazonOrder order = new AmazonOrder();
    order.doPlaceOrder("bat", -1);

  }

}
