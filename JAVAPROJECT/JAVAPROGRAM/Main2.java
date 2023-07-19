package JAVAPROGRAM;
class Sports {
 public void play() {
     System.out.println("Play sports");
 }
}
class Football extends Sports {
 public void play() {
     System.out.println("Play football");
 }
}
class Basketball extends Sports {
 public void play() {
     System.out.println("Play basketball");
 }
}
class Rugby extends Sports {
 public void play() {
     System.out.println("Play  rugby");
 }
}

public class Main2 {
 public static void main(String[] args) {
     Sports sports = new Sports();
     Football football = new Football();
     Basketball basketball = new Basketball();
     Rugby rugby = new Rugby();

 
     sports.play();       
     football.play();     
     basketball.play();   
     rugby.play();        
 }
}
