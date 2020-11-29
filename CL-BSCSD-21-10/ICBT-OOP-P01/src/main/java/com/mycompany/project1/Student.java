
package com.mycompany.project1;

public class Student extends Person {
    
    private String id;

    public Student() {
        
	this.id = "";
    
    }

    public Student(String id, String firstName, String lastName) {
        
	super(firstName, lastName);
        this.id = id;
    
    }

    public String getId() {
        
	return id;
    
    }

    public void setId(String id) {
        
	this.id = id;
    
    }
    
    @Override
    public String getFullName() {
        
	return "" + getFirstName() + " " + getLastName();
    
    } 
}



