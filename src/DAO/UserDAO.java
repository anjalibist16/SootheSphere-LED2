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
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;



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
     public boolean doesEx(String Name) {
        boolean eee=false;
        ResultSet re;
        Connection conn = mysql.openConnection();
        String query = "SELECT username FROM users WHERE username=?";
        try (PreparedStatement stt = conn.prepareStatement(query)) {
            stt.setString(1, (Name));
            re = stt.executeQuery();
            if(re.next()){
                if(re.getString("username").equals(Name)){
                    eee= true;
                }
                else {
                eee=  false;
                }
            }
        } catch (SQLException ex) {
            System.err.println("SQL error: " + ex.getMessage());
        } finally {

            mysql.closeConnection(conn);
        }
        return eee;
}

public String createUser(User sign) {
    if (doesEx(sign.getUsername())) {
        System.out.println("Exists");
        return "EXT";
    } else {

        Connection conn = mysql.openConnection();
        Calendar calendar = Calendar.getInstance();
        java.sql.Date currentDate = new java.sql.Date(calendar.getTimeInMillis());

        String sql = "INSERT INTO User(username,Password,Email,RegistrationDate) Values(?,?,?,?);";
        try (PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, sign.getUsername());
            p.setString(2, (sign.getPassword()));
            p.setString(3, (sign.getEmail()));
            p.setDate(4, currentDate); 
            p.executeUpdate();
        } catch (Exception f) {
            System.out.println(f);
            return "SQL";
        } finally {
            mysql.closeConnection(conn);
        }
    }
    return "OK";
}
}
