package com.raiayy;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    Point p1 = new Point();
    String a = JOptionPane.showInputDialog("Enter Initial X: ");
    String b = JOptionPane.showInputDialog("Enter Initial Y: ");
    double c = Double.parseDouble(a);
    double d = Double.parseDouble(b);
    p1.setParameters(c, d);
    p1.display();
    String p = JOptionPane.showInputDialog("Enter X to move: ");
    String q = JOptionPane.showInputDialog("Enter Y to move: ");
    double r = Double.parseDouble(p);
    double s = Double.parseDouble(q);
    p1.move(r, s);
    p1.checkOrigin();

  }
}
