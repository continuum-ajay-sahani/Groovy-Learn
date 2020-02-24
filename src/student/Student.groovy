package src.student

import src.entity.Identity

public class Student implements Identity{
  
   String display() {
      return name +' ,stu_'+ ID;
   }  
}