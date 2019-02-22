package com.raiayy;

public class Marks {
  int subOne, subTwo, subThree;

  public void setParameters(int a, int b, int c) {
    subOne = a;
    subTwo = b;
    subThree = c;

  }

  public void display() {
    System.out.println("Marks of Subjects are as follows-> Sub1: " + subOne + " " +
            "Sub 2: " + subTwo + " Sub 3: " + subThree);
  }

  public int sum() {
    int sum = subOne + subTwo + subThree;
    return sum;
  }

  public double percentage() {
    double totalPercentage = (((subOne + subTwo + subThree) / 3) * 100) / 100;
    return totalPercentage;
  }

  public void checkFail() {
    double totalPercentage = (((subOne + subTwo + subThree) / 3) * 100) / 100;
    if (totalPercentage < 40) {
      System.out.println("Candidate Failed :-( ");
    } else {
      System.out.println("Candidate Passed the Exam :-) ");
    }

  }

}
