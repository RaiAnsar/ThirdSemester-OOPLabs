package com.raiayy;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    Marks m1 = new Marks();
    String a = JOptionPane.showInputDialog("Marks of Subject 1: ");
    String b = JOptionPane.showInputDialog("Marks of Subject 2: ");
    String c = JOptionPane.showInputDialog("Marks of Subject 3: ");
    int p = Integer.parseInt(a);
    int q = Integer.parseInt(b);
    int r = Integer.parseInt(c);

    m1.setParameters(p, q, r);

    m1.display();

    System.out.println(m1.sum());
    System.out.println(m1.percentage());
    m1.checkFail();
  }
}
