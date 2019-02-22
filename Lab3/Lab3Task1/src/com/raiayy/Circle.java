package com.raiayy;

public class Circle {
  final double PI = 3.14159265359;
  double radius;
  public void setParameters(double a ){
    radius = a;
  }
  public void display(){
    System.out.println("Radius = "+ radius);
    System.out.println("Value of PI is "+ PI);
  }
  public double calculateCircumference(){
    double circumference = 2*PI*radius;
    return circumference;
  }
  public double calculateArea(){
    double area = PI*(radius*radius);
    return area;
  }

}
