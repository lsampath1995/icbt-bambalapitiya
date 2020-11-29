
package com.mycompany.project1;

public class Employee extends Person{
    
	private String epfNo;

    public Employee() {
        
	this.epfNo = "";
    
    }

    public Employee(String epfNo, String firstName, String lastName) {
        
	super(firstName, lastName);
        this.epfNo = epfNo;
    
    }

    public String getEpfNo() {
        
	return epfNo;
    
    }

    public void setEpfNo(String epfNo) {
        
	this.epfNo = epfNo;
    
    }
}
