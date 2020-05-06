package com.stacksimplify.restservices;

class DoSelectlab {
  int x = 5;
  int y = 5;
  public static void main(String args[]) {
    new DoSelectlab().print(2);
  }
  public void print(int x) {
    System.out.println(x+y);
    int y = 4;
  }
}