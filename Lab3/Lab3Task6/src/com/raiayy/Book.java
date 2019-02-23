package com.raiayy;

public class Book {
  String author;
  String[] chapterNames = new String[5];

  public void setParameters(String a, String[] b) {
    author = a;
    for (int i = 0; i < chapterNames.length; i++) {
      chapterNames[i] = b[i];
    }
  }
  public void display(){
    System.out.println("Author Name is: "+author);
    System.out.println("Chapters of  the Book are as follows: ");
    for (int i = 0; i< chapterNames.length; i++){
      System.out.println(chapterNames[i]);
    }
  }
  public void checkIfAuthorName(){
    if (author.startsWith("A")){
      System.out.println("Author's Name Start with 'A'.");
    }
    else
      System.out.println("Author's Name doesn't start with 'A'. ");
  }
}
