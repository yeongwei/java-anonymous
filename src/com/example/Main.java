package com.example;

// Pretending this like a Scala Trait
interface Trait {
  public int exec();
}

// Pretending this is a Scala Class or Object
public class Main {
  public static void main(String[] args) {
    Trait trait1 = new Trait() {
      public int exec() {
        System.out.println("This is trait1");
        return -1;
      }
    };
    
    Trait trait2 = new Trait() {
      public int exec() {
        System.out.println("This is trait2");
        return -2;
      }
    };
    
    trait1.exec();
    trait2.exec();
  }
}
