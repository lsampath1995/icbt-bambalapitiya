
package org.icbt.web.project;

public class User {
    
    private String username;
    
    private String firstName;
    
    private String lastName;
    
    private String password;

    public User() {
        
	this.username = "";
        this.firstName = "";
        this.lastName = "";
        this.password = "";
    }

    public User(String username, String firstName, String lastName, String password) {
        
	this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getUsername() {
        
	return username;
    }

    public void setUsername(String username) {
        
	this.username = username;
    }

    public String getFirstName() {
        
	return firstName;
    }

    public void setFirstName(String firstName) {
        
	this.firstName = firstName;
    }

    public String getLastName() {
        
	return lastName;
    }

    public void setLastName(String lastName) {
        
	this.lastName = lastName;
    }

    public String getPassword() {
        
	return password;
    }

    public void setPassword(String password) {
        
	this.password = password;
    }
    
    
}
