
package com.mycompany.icbt.oop.web;

public class student {
	
        private String id;
        private String name;
        private String nic;

    public student() {
        
	this.id = "";
        this.name = "";
        this.nic = "";
    }

    public student(String id, String name, String nic) {
        
	this.id = id;
        this.name = name;
        this.nic = nic;
    }

    public String getId() {
        
	return id;
    }

    public void setId(String id) {
        
	this.id = id;
    }

    public String getName() {
        
	return name;
    }

    public void setName(String name) {
        
	this.name = name;
    }

    public String getNic() {
        
	return nic;
    }

    public void setNic(String nic) {
        
	this.nic = nic;
    }
	
}
