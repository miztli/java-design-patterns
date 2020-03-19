package com.examples.java.structural.object.decorator;

public class IPhone implements MobilePhone {

  @Override
  public void on() {
    System.out.println("Display bitten apple in white screen!");
  }

  @Override
  public void shutdown() {
    System.out.println("Display bitten apple in black screen!");
  }

  @Override
  public void restart() {
    System.out.println("Display blank screen");
  }

  @Override
  public void lockScreen() {
    System.out.println("Turn off display");
  }

  @Override
  public void unlockScreen() {
    System.out.println("Turn on display");
  }
}
