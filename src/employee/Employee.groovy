package src.employee

import src.entity.Identity

public class Employee implements Identity{
  
   String display() {
      return name +' ,emp_'+ ID;
   }  
}