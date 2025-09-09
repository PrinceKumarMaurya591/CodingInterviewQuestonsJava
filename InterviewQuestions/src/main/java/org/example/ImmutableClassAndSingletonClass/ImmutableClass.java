package org.example.ImmutableClassAndSingletonClass;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
 
 private  String name;
 private  List<Integer>salary;
 
 public String getName() {
  return name;
 }

 public List<Integer> getSalary() {
  return salary;
 }

 private ImmutableClass(String name,List<Integer>salary) {
  this.name=name;
  this.salary=new ArrayList<>(salary);// डिफेंसिव कॉपी: salary की नई कॉपी बनाई गई
  
 }
 
 private ImmutableClass() {
  
 }
 
 
 @Override
 public String toString() {
  return "ImmutableClass [name=" + name + ", salary=" + salary + "]";
 }

 public static void main(String[] args) {
  List<Integer> salary=new ArrayList<Integer>();
  salary.add(100);
  salary.add(200);
  salary.add(300);
  
  ImmutableClass cls=new ImmutableClass("prince", salary);
  salary.add(400);
  salary.add(500);
     System.out.println(cls);
 }
 

}