
package com.mycompany.icbt.oop.web;

public class web_helper {
	
	 
    public static student[] getStudents() {
        
	    student [] students = new student[8];

            students[0] = new student("ST001", "Britany Norton", "124464635 V");
            students[1] = new student("ST002", "Merissa Pletcher", "126464385 V");
            students[2] = new student("ST003", "Carmelita Litherland", "164462390 V");
            students[3] = new student("ST004", "Buck Birdsong", "126464643 V");
            students[4] = new student("ST005", "Dennise Longwell", "124646376 V");
            students[5] = new student("ST006", "Zonia Suits", "124453731 V");
            students[6] = new student("ST007", "Nan Xavier", "125445431 V");
            students[7] = new student("ST008", "Marlen Hatfield", "126015453 V");
           
            return students;
    }
    
    public static String getGreeting() {
            
	    
	    String name = "Student";
            String greeting = "Details";    
            return name + " " + greeting;
        
    }
	
}
