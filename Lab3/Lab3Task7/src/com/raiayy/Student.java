package com.raiayy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
  double GPA;
  String[] subjects = new String[5];
  String email;

  public void setParameters(double a, String[] b, String c) {
    GPA = a;

    for (int i = 0; i < subjects.length; i++) {
      subjects[i] = b[i];
    }
    email = c;
  }

  public void display() {
    System.out.println(GPA);
    System.out.println("Registered courses of Student are as follows: ");
    for (int i = 0; i < subjects.length; i++) {
      System.out.print("  " + subjects[i]);
    }
    System.out.println(email);
  }

  public boolean searchSubject(String s) {
    boolean bool = false;
    for (int i = 0; i < subjects.length; i++) {
      if (s.equals(subjects[i])) {
        bool = true;
        break;
      } else
        bool = false;
    }
    return bool;
  }

  public void checkProbStatus() {
    if (GPA < 2) {
      System.out.println("Student is on Probation");
    } else {
      System.out.println("Good Academic Standings");
    }
  }

  public void validateEmail(String emailStr) {
    Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE).matcher(emailStr);
    if (matcher.find()) {
      System.out.println("The given email is valid");
    } else {
      System.out.println("The given email is invalid");
    }
  }
}
