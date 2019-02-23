package com.raiayy;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    Book b1 = new Book();
    String[] myarray = new String[5];
    String a = JOptionPane.showInputDialog("Enter Author Name: ");
    for (int i = 0; i < b1.chapterNames.length; i++) {
      myarray[i] = JOptionPane.showInputDialog("Enter Chapter No. " + (i + 1) + " Name: ");
    }
    b1.setParameters(a, myarray);
    b1.display();
    b1.checkIfAuthorName();
  }
}
