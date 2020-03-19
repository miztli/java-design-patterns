package com.examples.java.structural.object.decorator;

public class IPhoneDecorator implements MobilePhone {

  private MobilePhone mobilePhone;

  public IPhoneDecorator(MobilePhone mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  @Override
  public void on() {
    getMobilePhone().on();
    System.out.println("Display greetings!");
  }

  @Override
  public void shutdown() {
    System.out.println("Display goodbye message!");
    getMobilePhone().shutdown();
  }

  @Override
  public void restart() {
    System.out.println("Show spinning apple!");
    getMobilePhone().restart();
  }

  @Override
  public void lockScreen() {
    System.out.println("Trigger a sound");
    getMobilePhone().lockScreen();
  }

  @Override
  public void unlockScreen() {
    getMobilePhone().unlockScreen();
  }

  public void setMobilePhone(MobilePhone mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public MobilePhone getMobilePhone() {
    return mobilePhone;
  }
}
