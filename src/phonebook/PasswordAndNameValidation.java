/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PasswordAndNameValidation {
      
      public static boolean hasSpecialCharacter(String string) //This function checks if the user input includes unauthorized characters
    {
        Pattern spattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher smatcher = spattern.matcher(string);
        
        if(!smatcher.matches())
        {
            return true;
        }
        return false;
    }
    public boolean validate(String info,String str)//This function checks if the user input includes at least 6 characters(numbers or/and letters) without spaces 
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("phoneIcon.png"));
        boolean checkName;
        if(info.length() < 6)
        {
            JOptionPane.showMessageDialog(null, str+" must have at least 6 characters","Error",JOptionPane.INFORMATION_MESSAGE,icon);
            return true;
        }
        else
        {
            if(info.contains(" "))
            {
               JOptionPane.showMessageDialog(null,str+" cannot contain spaces","Error",JOptionPane.INFORMATION_MESSAGE,icon);
               return true;
            }
            else
            {
                checkName = hasSpecialCharacter(info);
                if (checkName == true)
                {
                    JOptionPane.showMessageDialog(null,str+" can only contain numbers and letters","Error",JOptionPane.INFORMATION_MESSAGE,icon); 
                    return true;
                }
            }
        }
        return false;
    }
}
