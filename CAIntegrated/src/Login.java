/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxim
 */
public class Login {
    int id;
    String first_name;
    String last_name;
    String username;
    String password;
    String email;
    int mob_num;
    
    public String getusername(){
        return username;
    }
    
    public void setusername(String username){
        this.username=username;
    }
    public String getpassword(){
        return password;
    }
     public void setpassword(String password){
        this.password=password;
    }
    
}