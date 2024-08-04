/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.UserDAO;
import Model.User;

/**
 *
 * @author asus
 */
public class Login {
    public boolean isLogin(User a){
    UserDAO k =new UserDAO();
    return k.login(a);
    }
}
