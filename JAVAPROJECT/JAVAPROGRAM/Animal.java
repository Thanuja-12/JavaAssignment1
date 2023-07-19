package JAVAPROGRAM;
//Animal class
class Animal {
 // Method to make a sound
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Bird class (subclass of Animal)
class Bird extends Animal {
 // Override the sound() method for Bird
 @Override
 public void sound() {
     System.out.println("Bird chirps!");
 }
}

//Cat class (subclass of Animal)
class Cat extends Animal {
 // Override the sound() method for Cat
 @Override
 public void sound() {
     System.out.println("Cat meows!");
 }
}

public class ANIMAL {
 public static void main(String[] args) {
     // Create instances of each animal
     Animal animal = new Animal();
     Bird bird = new Bird();
     Cat cat = new Cat();

     // Call the sound() method for each animal
     animal.sound(); // Output: Animal makes a sound
     bird.sound();   // Output: Bird chirps!
     cat.sound();    // Output: Cat meows!
 }
}
