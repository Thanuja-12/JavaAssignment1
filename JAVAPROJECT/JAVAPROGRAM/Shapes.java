package JAVAPROGRAM;
class Shape {
 public int getPerimeter() {
     return 0;
 }
 public double getArea() {
     return 0;
 }
}
class Circle extends Shape {
 private int radius;
 
 public Circle(int radius) {
     this.radius = radius;
 }
 public int getPerimeter() {
     return (int) (2 * Math.PI * radius);
 }
 public double getArea() {
     return (int) (Math.PI * radius * radius);
 }
}

public class Shapes{
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     System.out.println("Circle Perimeter: " + circle.getPerimeter());
     System.out.println("Circle Area: " + circle.getArea());
 }
}


