
package db;

public class MySQLUtil implements DBUtil {

    @Override
    public void getStudents() {
       System.out.println("Reading students from MySQL DB");
    }

    @Override
    public void addStudents() {
        System.out.println("Adding students from MySQL DB");
    }

    @Override
    public void updateStudents() {
        System.out.println("Updating students from MySQL DB");
    }

    @Override
    public void deleteStudents() {
        System.out.println("Deleting students from MySQL DB");
    }
    
}
