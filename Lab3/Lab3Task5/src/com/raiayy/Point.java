package com.raiayy;

public class Point {
  double x, y;

  public void setParameters(double a, double b){
    x = a;
    y = b;
  }
  public void display(){
    System.out.println("X = " +x+ " Y ="+y);
  }
  public void move(double c, double d){
    x = c;
    y = d;
    System.out.println("Point moved at: "+x+" "+y);
  }
  public boolean checkOrigin(){
    boolean bool;
    if (x==0 && y==0){
      bool = true;
    }
    else {
      bool = false;
    }
    return bool;
  }
}
