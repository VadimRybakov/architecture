package ru.geekbrains.adapter;

public class AdapterUsbToUsbC implements UsbC{

  private final Keyboard keyboard;

  public AdapterUsbToUsbC(Keyboard keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public String connect() {
    return keyboard.connectUsb();
  }

}
