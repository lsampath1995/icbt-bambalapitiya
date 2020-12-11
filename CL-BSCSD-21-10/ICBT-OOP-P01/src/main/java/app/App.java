
package app;

import process.Process;
import db.DBUtil;
import db.OracleUtil;


public class App {
     public static void main(String[] args) {
         
         
         DBUtil utl = new OracleUtil();
         
         Process p1 = new Process();
         p1.process(utl);
         
         
     }
}
