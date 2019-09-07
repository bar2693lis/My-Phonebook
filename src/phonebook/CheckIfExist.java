/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CheckIfExist {
    UserInfo tempUser;
    private static Scanner scan;
    
    public boolean readFile(String UserName, String filepath)
    {
        boolean found = false;
        String ID = "";
        String password = "";
        try{
            scan = new Scanner (new File(filepath));
            scan.useDelimiter("[,\n]");
            while(scan.hasNext() && !found)
            {
                ID = scan.next();
                password = scan.next();
                if(ID.equals(UserName))
                {
                    found = true;
                }
            }
        }
        catch(Exception e)
        {
          
        }
        return found;
    }
}
