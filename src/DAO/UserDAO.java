/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.User;
import database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class UserDAO {
    MySqlConnection mysql = new MySqlConnection();
    public boolean login(User a){
        
         Connection conn = mysql.openConnection();
        String sql = "SELECT * FROM User where username = ? and Password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,(a.getUsername()));
            pstmt.setString(2,(a.getPassword()));
            ResultSet result = pstmt.executeQuery();
            if(result.next()){return true;}
        }catch(Exception e){System.out.println(e);
        return false;}
        finally{
        mysql.closeConnection(conn);
        }
            
      return false;      
    }
}
