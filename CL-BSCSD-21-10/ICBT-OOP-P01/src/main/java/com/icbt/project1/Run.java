
package com.icbt.project1;

public class Run {
    
	public static void main(String[] args) {
       
	    System.out.println("");
	    System.out.println("=============== WELCOME TO ICBT CAMPUS ===============");
	    System.out.println("");
        
            Student st = new Student();
            System.out.print(st.id1);
	    System.out.print(st.firstName1);
	    System.out.println(st.lastName1);
	
	    Student st2 = new Student();
	    System.out.print(st.id2);
            System.out.print(st2.firstName2);
	    System.out.println(st2.lastName2);
	
	    Student st3 = new Student();
	    System.out.print(st.id3);
            System.out.print(st3.firstName3);
	    System.out.println(st3.lastName3);
	
	    System.out.println("");
	    System.out.println("======================================================");
	    System.out.println("");
	
	}
}
