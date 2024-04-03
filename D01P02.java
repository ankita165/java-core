package com.learning.core.day1session1;


interface Medicine {

 void displayLabel();
}

class Tablet implements Medicine {
 
 public void displayLabel() {
     System.out.println("Store Tablets in a cool dry place.");
 }
}

class Syrup implements Medicine {

 public void displayLabel() {
     System.out.println("Syrup is consumable only on prescription.");
 }
}

class Ointment implements Medicine {

 public void displayLabel() {
     System.out.println("Ointment is for external use only.");
 }
}

public class D01P02 {  //i am not able to create class name with TestClass because i have aleredy creted this class according to the organisation requirement.
 public static void main(String[] args) {
     
     Medicine m1 = new Tablet();
     m1.displayLabel(); 
     
     Medicine m2 = new Syrup();
     m2.displayLabel(); 
     
     Medicine m3 = new Ointment();
     m3.displayLabel(); 
      
 }
}