
package com.mycompany.project1;

public class App {
    
	public static void main(String[] args) {
        
           System.out.println("");
	   System.out.println("=============== WELCOME TO ICBT CAMPUS ===============");
	   System.out.println("");
		
	   Person [] persons = new Person[6];
	   
	   persons[0] = new Student("ST01", "01. Lahiru", "Sampath"); 
           persons[1] = new Student("ST02", "02. Kasun", "Silva");
	   persons[2] = new Student("ST03", "03. Nuwan", "Pradeep"); 
        
	   persons[3] = new Employee("1", "01. Kalum", "Perera");
           persons[4] = new Employee("2", "02. Supun", "Sampath");
	   persons[5] = new Employee("3", "03. Nipuni", "Silva"); 
        
           for (int i = 0; i < persons.length; i++) {
            
		System.out.println(persons[i].getFullName());
		
	}
	   
	   System.out.println("");
	   System.out.println("======================================================");
	   System.out.println("");
	
	      
    }
}




