
package org.icbt.web.project;

import java.io.IOException;
import java.net.http.HttpResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WebHelper {
    
    
    public static Student[] getStudents() {
        
	    Student [] Students = new Student[8];

            Students[0] = new Student("ST001", "Britany Norton", "124464635 V");
            Students[1] = new Student("ST002", "Merissa Pletcher", "126464385 V");
            Students[2] = new Student("ST003", "Carmelita Litherland", "164462390 V");
            Students[3] = new Student("ST004", "Buck Birdsong", "126464643 V");
            Students[4] = new Student("ST005", "Dennise Longwell", "124646376 V");
            Students[5] = new Student("ST006", "Zonia Suits", "124453731 V");
            Students[6] = new Student("ST007", "Nan Xavier", "125445431 V");
            Students[7] = new Student("ST008", "Marlen Hatfield", "126015453 V");
        
        return Students;
    }
    
    public static String getGreeting() {
            
	    String name = "Details";
            String greeting = "Student";    
            return greeting + " " + name;
        
    }
    
    public static User authenticate(String username, String password) {
        
	User authenticatedUser = null;
        
        //These data loading from the DB
        User user = new User("admin", "John", "Smith", "admin123");
        
        //Authenticating the username & password
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            authenticatedUser= user;
        }
        
        return authenticatedUser;
    }
    
    
    public static User authenticate(Cookie[] cookies, HttpSession session) {
        
        // Getting the old authenticated user data from cookie session
        User user = null;

        // Iterating all the available cookies from the client request
        for (Cookie cookie : cookies) {
            
            // Checking SESID cookie
            if (cookie.getName().equals("SESID")) {                        
                
                // Lookingup for SESID cookie value from sessions
                Object sessionObj = session.getAttribute(cookie.getValue());

                // Loading the user from session object if it is exists
                if (sessionObj != null) {
                     user = (User)sessionObj;
                }
            }
        }
        return user;
    }
    
    public static void redirectToLogin(HttpServletResponse response) throws IOException{
        
	response.sendRedirect("login.jsp");
    }
    
}
