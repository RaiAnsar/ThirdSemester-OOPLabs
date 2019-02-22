package com.raiayy;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    Account a1 = new Account();
    String a = JOptionPane.showInputDialog("Enter Balance: ");
    String b = JOptionPane.showInputDialog("Enter Year of Opening: ");
    String c = JOptionPane.showInputDialog("Enter CNIC #: ");
    int p = Integer.parseInt(a);
    int q = Integer.parseInt(b);
    a1.setParameters(p, q, c);
    a1.display();
    String d = JOptionPane.showInputDialog("Enter Amount to Withdraw: ");
    int w = Integer.parseInt(d);
    a1.withdraw(w);
    String e = JOptionPane.showInputDialog("Enter Amount to Deposit: ");
    int dep = Integer.parseInt(e);
    a1.deposit(dep);
    System.out.println("Enterd CNIC is : " + a1.validCNIC());
  }
}
