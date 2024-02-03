package week_3_day5;

import week_3_day5.Demo.Demo;

class c extends Demo {
    void print() {
      System.out.println(x);
      System.out.println(y);//the field Demo.y is not visible error occured.
  
    }
  }
  
  public class Practice4 {
    public static void main(String[] args) {
      System.out.println("Hello I'm Main method.");
      c obj = new c();
      obj.print();
  
    }
  
  }