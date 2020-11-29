
package com.mycompany.project1;

public class Person {
    
	private String firstName;
        private String lastName;
    
    public Person() {
        
	this.firstName = "";
        this.lastName = "";
    
    }
    public Person(String firstName, String lastName) {
        
	this.firstName = firstName;
        this.lastName = lastName;
    
    }
    
    /**
    *@return the firtName
    */
    
    public String getFirstName() {
        
	return firstName;
    
    }
    public String getFirstName(String a) {        
        
	return firstName;
    
    }
    public void setFirstName(String firstName) {
        
	this.firstName = firstName;
    
    }
    public String getLastName() {
        
	return lastName;
    
    }
    
    /**
     *@param lastName the lastName to set
     */
    
    public void setLastName(String lastName) {
        
	this.lastName = lastName;
    
    }
    public String getFullName() {
        
	return this.firstName + " " + this.lastName;
    
    }  
}

