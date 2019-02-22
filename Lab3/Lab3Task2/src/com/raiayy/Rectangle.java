package com.raiayy;

public class Rectangle {
  int length, width;

  public void setParameters(int a, int b) {
    length = a;
    width = b;
  }

  public void display() {
    System.out.println("Length = " + length + " Width = " + width);
  }

  public int calculateArea() {
    int area = length * width;
    return area;
  }

  public void checkSquare() {
    if (length == width)
      System.out.println("It is a Square.");
    else
      System.out.println("It is not a square.");

  }

}
