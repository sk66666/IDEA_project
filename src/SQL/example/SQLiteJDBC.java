package SQL.example;

import java.sql.*;

public class SQLiteJDBC
{
    public static void main( String args[] )
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:D://anyfiles//软件//sqlite-tools-win32-x86-3360000//student.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM tb_user;" );
            ResultSetMetaData meta = rs.getMetaData();
            String format[]={"%-5s","%-10s","%-5s","%-16s"};
            for(int i=1;i<=meta.getColumnCount();i++){
                System.out.printf(format[i-1],meta.getColumnName(i));
            }
            System.out.println();

            while ( rs.next() ) {
                String id    = rs.getString(1);
                String name  = rs.getString(2);
                String sex   = rs.getString(3);
                String email = rs.getString(4);
                System.out.printf(format[0], id );
                System.out.printf(format[1], name );
                System.out.printf(format[2], sex );
                System.out.printf(format[3], email );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}

