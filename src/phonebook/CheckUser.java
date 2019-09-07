/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CheckUser {
    private static Scanner scan;
    
    public void checkFile(UserInfo User, String filepath)//This function checks if a user exists in the system in order to enter
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("phoneIcon.png"));
        boolean found = false;
        String ID = "";
        String password = "";
        try{
            scan = new Scanner (new File(filepath));
            scan.useDelimiter("[,\n]");
            while(scan.hasNext() && !found) // loop to check if the received user exists in the users DataBase
            {
                ID = scan.next();
                password = scan.next();
                if(ID.equals(User.getUserName()))
                {
                    found = true;
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in User file","Error",JOptionPane.INFORMATION_MESSAGE,icon);
        }
        if(found == false) //if the input was not found in the DataBase
            {
               JOptionPane.showMessageDialog(null, "You need to register before use","Error",JOptionPane.INFORMATION_MESSAGE,icon); 
               new LoginPage().setVisible(true);
            }
            else //if the input was found in the DataBase
            {
                if(password.equals(User.getPassword())) //checks if the inserted password matches the user password in the DataBase
                {
                    File userContacts = new File(User.getUserName()+ ".txt");
                    if(!userContacts.exists()){   //checks if there is a file for this user if not, the system create a new file for the user
                        try {                     // if yes, it upload all the data from this user DataBase
                            userContacts.createNewFile();
                            SingeltonFileName filename = SingeltonFileName.getInstance();
                            filename.setName(User.getUserName()+".txt");
                            InsertToArrayFromFile insert = new InsertToArrayFromFile();
                            insert.InsertToArrayFromFile(User.getUserName()+ ".txt");
                            new First().setVisible(true);  //opens the first frame for the user
                        } catch (IOException ex) {
                            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        
                        SingeltonFileName filename = SingeltonFileName.getInstance();
                        filename.setName(User.getUserName()+".txt");
                        InsertToArrayFromFile insert = new InsertToArrayFromFile();
                        insert.InsertToArrayFromFile(User.getUserName()+ ".txt");

                        new First().setVisible(true); //opens the first frame for the user
                        new LoginPage().setVisible(false);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The Password you have entered is incorrect!!!","Error",JOptionPane.INFORMATION_MESSAGE,icon);
                     new LoginPage().setVisible(true);
                }
            }
        
        
    }
}

