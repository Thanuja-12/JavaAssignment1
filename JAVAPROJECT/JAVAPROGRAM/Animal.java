package JAVAPROGRAM;
class Animal 
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}
class Bird extends Animal {
 public void sound() {
     System.out.println("Bird chirps!");
 }
}

class Cat extends Animal {
 public void sound() {
     System.out.println("Cat meows!");
 }
}

public class ANIMAL {
 public static void main(String[] args) {
     Animal animal = new Animal();
     Bird bird = new Bird();
     Cat cat = new Cat();
     animal.sound(); 
     bird.sound();   
     cat.sound();    
 }
}
