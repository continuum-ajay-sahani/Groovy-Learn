package src.entity

trait Identity {
   String name;
   int ID;
	
   abstract String display()
   
   String greeting() { 
      "Hello, ${name}!" 
   }
}