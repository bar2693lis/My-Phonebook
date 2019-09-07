package Test;


import org.junit.Test;
import static org.junit.Assert.*;
import phonebook.CheckUser;
import phonebook.UserInfo;


public class CheckUserTest {
      
     //Test of checkFile method, of class CheckUser.
    
    @Test
    public void testCheckFile() {
        UserInfo User = new UserInfo("shaylevi","111111");
        String filepath = "User.txt";
        CheckUser instance = new CheckUser();
        instance.checkFile(User, filepath);
        
    }
    
}