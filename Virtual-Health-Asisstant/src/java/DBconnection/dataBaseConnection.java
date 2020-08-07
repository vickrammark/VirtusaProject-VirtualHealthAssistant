
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnection;

import com.pageDirector.LoginDetails;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class dataBaseConnection {
    
    private static HikariConfig config=new HikariConfig();
    private static HikariDataSource ds;
    
    public Connection getDbConnection(LoginDetails log) throws SQLException
    {
        
    }
    
}
