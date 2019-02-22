package com.raiayy;

public class Account {
  int balance;
  int yesrOfOpening;
  String CNIC;

  public void setParameters(int a, int b, String c) {
    balance = a;
    yesrOfOpening = b;
    CNIC = c;
  }

  public void display() {
    System.out.println("Balance = " + balance);
    System.out.println("Year of Opening is: " + yesrOfOpening);
    System.out.println("CNIC + " + CNIC);
  }

  public void withdraw(int remove) {
    if (balance < remove)
      System.out.println("Balance is lower than requested amount");
    else {
      balance = balance - remove;
      System.out.println(remove + " is withdrawn, updated balance is: " + balance);
    }
  }

  public void deposit(int add) {
    balance = balance + add;
    System.out.println(add + "is deposited Successful, new balance is: " + balance);
  }

  public boolean validCNIC() {
    boolean bool;
    if (CNIC.length() == 13) {
      bool = true;
    } else
      bool = false;
    return bool;
  }
}
