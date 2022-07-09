package SQL.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {  

public static int save(User u){
    int status=0;  
    Connection conn=null;
    PreparedStatement ps=null;
    try{  
         conn = JDBCUtil.getConnection();
         ps   = conn.prepareStatement(  
        "insert into tb_user(name, sex, email) values(?,?,?)");  
        
        ps.setString(1,u.getName());  
        ps.setString(2,u.getSex()); 
        ps.setString(3,u.getEmail());  
        
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}

    return status;  
}

public static int update(User u){  
    int status=0;
    Connection conn=null;
    PreparedStatement ps=null;
    try{  
         conn = JDBCUtil.getConnection();
        		
         ps=conn.prepareStatement(  
"update tb_user set name=?, sex=?, email=? where id=?");  
        ps.setString(1,u.getName());  
        ps.setString(2,u.getSex());  
        ps.setString(3,u.getEmail());  

        ps.setInt(4,   u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}
    finally {
    	try {
			JDBCUtil.closeResource(conn, ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    return status;  
}
public static void exit(){
    Connection conn=null;
    PreparedStatement ps=null;
    try{
//        conn = JDBCUtil.getConnection();
//        ps=conn.prepareStatement("");

    }catch(Exception e){System.out.println(e);}
    finally {
        try {
            JDBCUtil.closeResource(conn, ps);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public static int delete(int id){
    int status=0;
    Connection conn=null;
    PreparedStatement ps=null;
    try{
        conn = JDBCUtil.getConnection();
        ps   = conn.prepareStatement(
                "delete from tb_user where id=?");

        ps.setInt(1,id);

        status=ps.executeUpdate();
    }catch(Exception e){System.out.println(e);}

    return status;
}


public static List<User> getAllRecords(){
    List<User> list=new ArrayList<User>();  
    Connection conn =null;
    PreparedStatement ps=null;
    ResultSet rs = null;
    try{  
         conn = JDBCUtil.getConnection();
         ps=conn.prepareStatement("select * from tb_user");  
         rs=ps.executeQuery();  
        while(rs.next()){  
            User u=new User();  
            
            u.setId(rs.getInt("id"));  
            u.setName(rs.getString("name"));  
            u.setSex(rs.getString("sex"));  
            u.setEmail(rs.getString("email"));  
           
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}

    return list;  
}

}  