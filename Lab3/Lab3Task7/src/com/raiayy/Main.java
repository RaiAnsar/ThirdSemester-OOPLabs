package com.raiayy;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    Student s1 = new Student();
    String[] myarray = new String[5];
    String a = JOptionPane.showInputDialog("Enter GPA: ");
    String b = JOptionPane.showInputDialog("Enter Email Address: ");
    double gp = Double.parseDouble(a);
    for (int i = 0; i < s1.subjects.length; i++) {
      myarray[i] = JOptionPane.showInputDialog("Enter Chapter No. " + (i + 1) + " Name: ");
    }
    s1.setParameters(gp, myarray, b);
    s1.searchSubject("Intro");
    s1.checkProbStatus();
    s1.display();
    s1.validateEmail(b);
  }

}
