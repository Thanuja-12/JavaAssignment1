package JAVAPROGRAM;
class Employee {
 public void work() {
     System.out.println("Employee working");
 }
 public void getSalary() {
     System.out.println("Employee getting salary");
 }
}
class HRManager extends Employee {
 public void work() {
     System.out.println("HR Manager");
 }
 public void addEmployee() {
     System.out.println("HR Manager select emp");
 }
}

public class Main {
 public static void main(String[] args) {
     Employee emp = new Employee();
     emp.work();     
     emp.getSalary(); 
     HRManager hrManager = new HRManager();
     hrManager.work();         
     hrManager.getSalary();    
     hrManager.addEmployee();
 }
}
