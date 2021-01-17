
package org.icbt.web.project;

import java.io.IOException;
import java.net.http.HttpResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WebHelper {
    
    
    public static Student[] getStudents() {
        Student [] students = new Student[8];

            students[0] = new Student("ST001", "Britany Norton", "124464635 V");
            students[1] = new Student("ST002", "Merissa Pletcher", "126464385 V");
            students[2] = new Student("ST003", "Carmelita Litherland", "164462390 V");
            students[3] = new Student("ST004", "Buck Birdsong", "126464643 V");
            students[4] = new Student("ST005", "Dennise Longwell", "124646376 V");
            students[5] = new Student("ST006", "Zonia Suits", "124453731 V");
            students[6] = new Student("ST007", "Nan Xavier", "125445431 V");
            students[7] = new Student("ST008", "Marlen Hatfield", "126015453 V");
        
        return students;
    }
    
    public static String getGreeting() {
            
	    String name = "Details";
            String greeting = "Student";    
            return greeting + " " + name;
        
    }
    
    public static User authenticate(String username, String password) {
        User authenticatedUser = null;
        
        //This should loaded from the DB
        User user = new User("admin", "John", "Smith", "admin123");
        
        //Authenticated the users password
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            authenticatedUser= user;
        }
        
        return authenticatedUser;
    }
    
    
    public static User authenticate(Cookie[] cookies, HttpSession session) {
        // Authenticate the user from cookie session
        User user = null;

        // Iterate all the cookies from the client request
        for (Cookie cookie : cookies) {
            // Checks SESID cookie
            if (cookie.getName().equals("SESID")) {                        
                // Lookup SESID cookie value from sessions
                Object sessionObj = session.getAttribute(cookie.getValue());

                // Load the user from session object if it exists
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
