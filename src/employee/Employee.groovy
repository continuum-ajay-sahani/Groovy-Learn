package src.employee

import src.entity.Identity

public class Employee implements Identity{
  
   String display() {
      return name +' ,emp_'+ ID;
   }

   String display2() {
      return name +' ,emp_'+ ID+'_2';
   }  
}