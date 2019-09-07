/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author HP
 */
public class UserInfo {  
    private String UserName ;
    private String Password ;
    
    public UserInfo(){
        
    }
    public UserInfo(String UserName, String Password) //constructor for new user
    {
        this.UserName = UserName;
        this.Password = Password;
    }
    
    public String getUserName()
    {
        return UserName;
    }
    
    public void setUserName(String name)
    {
        this.UserName = name;
    }
    
        public String getPassword()
    {
        return Password;
    }
    
    public void setPassword(String password)
    {
        this.Password = password;
    }    
}
