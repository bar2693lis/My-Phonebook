package Test;

import org.junit.Test;
import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import phonebook.CheckIfExist;
import phonebook.LoginPage;
import phonebook.ToFile;
import phonebook.UserInfo;
import phonebook.UserNameFile;

public class UserNameFileTest {

    
     //Test of saveRecords method, of class UserNameFile, to save user(username and password) to a file that saves the users.
    @Test
    public void testSaveRecords_String_UserInfo() {
        
        String filepath = "User.txt";
        UserInfo user = new UserInfo("shaylevi237","111111");
        boolean check = new CheckIfExist().readFile(user.getUserName(), "User.txt");
        if(check == true)
        {
            System.out.println("This USERNAME is already exist, Please choose a differnt USERNAME");
            
        }
        else  //username do not exist in the DataBase
        { 
           UserNameFile instance = new UserNameFile();
           instance.saveRecords(filepath, user);
        }
        
    }
    
   
     // Test of saveRecords method, of class UserNameFile.
    @Test
    //abstract method , not used in this class
    public void testSaveRecords_String() {
        
    } 
}
