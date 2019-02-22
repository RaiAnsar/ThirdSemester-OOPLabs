package com.raiayy;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    String a = JOptionPane.showInputDialog("Enter Length: ");
    String b = JOptionPane.showInputDialog("Enter width: ");
    int p = Integer.parseInt(a);
    int q = Integer.parseInt(b);
    r1.setParameters(p, q);
    r1.display();
    System.out.println("Area" + r1.calculateArea());
    r1.checkSquare();
  }
}
