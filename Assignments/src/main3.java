// Base class
class Animal {
  void eat() {
      System.out.println("Animal is eating.");
  }
}

// Derived class inheriting from Animal
class Dog extends Animal {
  void bark() {
      System.out.println("Dog is barking.");
  }

  // Constructor for Dog class
  Dog() {
      super(); // Call the constructor of the superclass (Animal)
  }
}

// Derived class inheriting from Dog
class Bulldog extends Dog {
  void guard() {
      System.out.println("Bulldog is guarding.");
  }

  // Constructor for Bulldog class
  Bulldog() {
      super(); // Call the constructor of the superclass (Dog)
  }
}

// Main class
public class main3 {
  public static void main(String[] args) {
      Bulldog myDog = new Bulldog();

      // Calling methods from different levels of inheritance
      myDog.eat();    // Method from Animal class
      myDog.bark();   // Method from Dog class
      myDog.guard();  // Method from Bulldog class
  }
}
