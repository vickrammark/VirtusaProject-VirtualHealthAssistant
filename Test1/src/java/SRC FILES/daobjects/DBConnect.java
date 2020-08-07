package daobjects;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static Connection con;

    /**
     * @return the con
     */
    public static Connection getCon() {
          try
          {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","db_employee","sql");
          }
          catch(Exception e)
          {
               System.out.println("     "+e);
          }

        return con;
    }



}
