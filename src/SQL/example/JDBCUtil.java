package SQL.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	 
    public static final String DRIVERNAME = "org.sqlite.JDBC";
    public static final String URL        = "jdbc:sqlite:D://anyfiles//软件//sqlite-tools-win32-x86-3360000//student.db";
    public static final String USER     = null;
    public static final String PASSWORD = null;
 
    public static Connection conn = null;
 
    
    public static void main(String[] args) {
		
	}

    public static Connection getConnection() throws Exception {
        if (conn != null) {
            return conn;
        }
         
        Class.forName(DRIVERNAME);  //org.sqlite.JDBC
       
        //conn = DriverManager.getConnection(URL, USER, PASSWORD);
        conn = DriverManager.getConnection(URL);
        return conn;
    }
 
    public static void closeResource(Connection conn, PreparedStatement st) throws SQLException {
        if(st!=null)st.close();
        if(conn!=null)conn.close();
    }
 
    public static void closeResource(Connection conn,  Statement st, ResultSet rs) throws SQLException {
        
    	if(st!=null)st.close();
        if(rs!=null)rs.close();
        if(conn!=null)conn.close();
    }
}