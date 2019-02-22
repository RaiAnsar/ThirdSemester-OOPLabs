package com.raiayy;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        String x = JOptionPane.showInputDialog("Enter Your Radius Here: ");
        double y = Double.parseDouble(x);
        c1.setParameters(y);
        c1.display();
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculateCircumference());

    }
}
